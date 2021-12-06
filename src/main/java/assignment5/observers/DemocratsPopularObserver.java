package assignment5.observers;

import assignment5.State;
import assignment5.VotingObservable;
import assignment5.states.*;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class DemocratsPopularObserver implements Observer, IDisplay {

    ArrayList<State> states = new ArrayList<>();


    public DemocratsPopularObserver(Observable observable) {
        observable.addObserver(this);
    }


    public void update(Observable observable, Object stateObject) {
        if (observable instanceof VotingObservable) {
            VotingObservable voting = (VotingObservable) observable;
            this.states = voting.getStates();
            displayPopVote();
            displayElectVote();
            displayLegalMessage();
        }
    }

    @Override
    public void displayPopVote() {
        //TODO fill out
    }

    @Override
    public void displayElectVote() {
        //TODO fill out
    }

    @Override
    public void displayLegalMessage() {

        System.out.println("All reports are purely observational and not legally binding in any way");
        //TODO Add Current Time
    }

}

