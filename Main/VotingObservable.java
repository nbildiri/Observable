package assignment5;

import java.util.ArrayList;
import java.util.Observable;


public class VotingObservable extends Observable {

    ArrayList<State> states = new ArrayList<>();


    public void votesChanged() {
        setChanged();
        notifyObservers();
    }

    public void setVotes(ArrayList<State> states) {
        this.states = states;
        votesChanged();
    }

    // Needed for pull:
    public ArrayList<State> getStates() {
        return states;
    }
}
