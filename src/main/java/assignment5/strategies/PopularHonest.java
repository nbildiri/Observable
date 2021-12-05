package assignment5.strategies;

import assignment5.VotingObservable;
import assignment5.states.*;

import java.util.Observable;

public class PopularHonest{

    Florida florida;
    Michigan michigan;
    California cali;
    Texas texas;
    NewYork newYork;

    public PopularHonest(Florida florida, Michigan michigan, California cali, Texas texas, NewYork newYork) {
        this.florida = florida;
        this.michigan = michigan;
        this.cali = cali;
        this.texas = texas;
        this.newYork = newYork;
    }

    public int getDem()
    {
        return florida.getDem() + newYork.getDem() + cali.getDem() + michigan.getDem() + texas.getDem();
    }

    public int getRep()
    {
        return florida.getRep() + newYork.getRep() + cali.getRep() + michigan.getRep() + texas.getRep();
    }

}
