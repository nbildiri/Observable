package assignment5.observers;

import assignment5.VotingObservable;
import assignment5.states.*;
import assignment5.strategies.ElectoralHonest;
import assignment5.strategies.PopularHonest;

import java.util.Observable;
import java.util.Observer;

public class HonestObserver implements Observer, IDisplay {

    Florida florida;
    Michigan michigan;
    California cali;
    Texas texas;
    NewYork newYork;


    public HonestObserver(Observable observable) {
        observable.addObserver(this);
    }


    public void update(Observable observable, Object stateObject)
    {
        if (observable instanceof VotingObservable)
        {
            VotingObservable voting = (VotingObservable) observable;
            this.florida = voting.getFlorida();
            this.michigan = voting.getMichigan();
            this.cali = voting.getCali();
            this.texas = voting.getTexas();
            this.newYork = voting.getNewYork();
            displayPopVote();
            displayElectVote();
            displayLegalMessage();
        }
    }

    @Override
    public void displayPopVote() {
        PopularHonest popHonest = new PopularHonest(florida, michigan, cali, texas, newYork);
        System.out.println("\nHonest Popular Vote: " + popHonest.getDem());
    }

    @Override
    public void displayElectVote() {
        ElectoralHonest electHonest = new ElectoralHonest(florida, michigan, cali, texas, newYork);
        System.out.println("Honest Electoral Vote: " + electHonest.getElect());
    }

    @Override
    public void displayLegalMessage() {

        System.out.println("All reports are purely observational and not legally binding in any way");
        //TODO Add Current Time
    }

}
