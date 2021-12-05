package assignment5.strategies;

import assignment5.states.*;

import java.util.ArrayList;
import java.util.Collections;

public class PopularDem {

    Florida florida;
    Michigan michigan;
    California cali;
    Texas texas;
    NewYork newYork;
    ArrayList<Integer> stateStatsRep = new ArrayList<>();

    public PopularDem(Florida florida, Michigan michigan, California cali, Texas texas, NewYork newYork) {
        this.florida = florida;
        this.michigan = michigan;
        this.cali = cali;
        this.texas = texas;
        this.newYork = newYork;
    }

    public int getDem() {

        stateStatsRep.add(florida.getRep());
        stateStatsRep.add(newYork.getRep());
        stateStatsRep.add(cali.getRep());
        stateStatsRep.add(michigan.getRep());
        stateStatsRep.add(texas.getRep());

        Collections.sort(stateStatsRep);
        stateStatsRep.remove(stateStatsRep.size() - 1);

        int popularRep = 0;

        for (int state : stateStatsRep) {
            popularRep += state;
        }

        PopularHonest popularHonest = new PopularHonest(florida, michigan, cali, texas, newYork);

        return popularRep + popularHonest.getDem();

    }
}
