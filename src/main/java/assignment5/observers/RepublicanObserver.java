package assignment5.observers;

import assignment5.State;
import assignment5.VotingObservable;


import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class RepublicanObserver extends MainObserver implements Observer, IDisplay {


    public RepublicanObserver(Observable observable) {
        observable.addObserver(this);
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
