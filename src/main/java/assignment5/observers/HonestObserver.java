package assignment5.observers;

import assignment5.State;
import assignment5.VotingObservable;
import assignment5.states.*;
import assignment5.strategies.ElectoralHonest;
import assignment5.strategies.PopularHonest;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class HonestObserver implements Observer, IDisplay {

   ArrayList<State> states;


    public HonestObserver(Observable observable) {
        observable.addObserver(this);
    }


    public void update(Observable observable, Object stateObject)
    {
        if (observable instanceof VotingObservable)
        {
            VotingObservable voting = (VotingObservable) observable;
            this.states = voting.getStates();
            displayPopVote();
            displayElectVote();
            displayLegalMessage();
        }
    }

    @Override
    public void displayPopVote() {
        PopularHonest popHonest = new PopularHonest(states);
        System.out.println("\nHonest Popular Vote: " + popHonest.getDem());
    }

    @Override
    public void displayElectVote() {
        ElectoralHonest electHonest = new ElectoralHonest(states);
        System.out.println("Honest Electoral Vote: " + electHonest.getElect());
    }

    @Override
    public void displayLegalMessage() {

        System.out.println("All reports are purely observational and not legally binding in any way");
        //TODO Add Current Time
    }

}
