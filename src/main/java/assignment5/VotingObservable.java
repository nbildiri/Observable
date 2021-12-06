package assignment5;

import assignment5.states.*;

import java.util.ArrayList;
import java.util.Observable;


public class VotingObservable extends Observable {

    ArrayList<State> states;


    public void votesChanged() {
        setChanged();
        notifyObservers();
    }

    public void setVotes(ArrayList<State> states) {
        this.states.addAll(states);
        votesChanged();
    }

    // Needed for pull:

    public ArrayList<State> getStates() {
        return states;
    }
}
