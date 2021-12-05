package assignment5;

import assignment5.states.*;

import java.util.ArrayList;
import java.util.Observable;


public class VotingObservable extends Observable {

    Florida florida;
    Michigan michigan;
    California cali;
    Texas texas;
    NewYork newYork;


    public void votesChanged ()
    {
        setChanged();
        notifyObservers();
    }

  /*  public void setVotes (String state, int dem, int pop, int elect)
    {
        this.state = state;
        this.dem = dem;
        this.pop = pop;
        this.elect = elect;
        votesChanged();
    }*/

    public void setVotes (Florida florida, Michigan michigan, California cali, Texas texas, NewYork newYork)
    {
        this.florida = florida;
        this.michigan = michigan;
        this.cali = cali;
        this.texas = texas;
        this.newYork = newYork;
        votesChanged();
    }

    // Needed for pull:
    public Florida getFlorida() {
        return florida;
    }

    public Michigan getMichigan() {
        return michigan;
    }

    public California getCali() {
        return cali;
    }

    public Texas getTexas() {
        return texas;
    }

    public NewYork getNewYork() {
        return newYork;
    }
}
