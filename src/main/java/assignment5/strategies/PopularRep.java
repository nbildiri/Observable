package assignment5.strategies;

import assignment5.states.*;

public class PopularRep {

    Florida florida;
    Michigan michigan;
    California cali;
    Texas texas;
    NewYork newYork;

    public PopularRep(Florida florida, Michigan michigan, California cali, Texas texas, NewYork newYork) {
        this.florida = florida;
        this.michigan = michigan;
        this.cali = cali;
        this.texas = texas;
        this.newYork = newYork;
    }


    public int getPopularRep() {
        PopularHonest popularHonest = new PopularHonest(florida, michigan, cali, texas, newYork);
        return (int) (popularHonest.getRep() + (popularHonest.getDem() - popularHonest.getDem() * .05));
    }

}
