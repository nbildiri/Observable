package assignment5.observers;

import assignment5.State;
import assignment5.VotingObservable;
import assignment5.strategies.IStrategy;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class MainObserver implements Observer, IDisplay{

    ArrayList<State> states = new ArrayList<>();
    IStrategy strategy;

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

    }

    @Override
    public void displayElectVote() {

    }

    @Override
    public void displayLegalMessage() {
        System.out.println("\nAll reports are purely observational and not legally binding in any way");
        //TODO Add Current Time
    }
}
