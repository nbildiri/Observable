package assignment5.strategies;

import assignment5.states.*;

import java.util.ArrayList;

public class ElectoralDemA {

    Florida florida;
    Michigan michigan;
    California cali;
    Texas texas;
    NewYork newYork;
    ArrayList<IStateStats> stateStatsDem = new ArrayList();
    ElectoralHonest electHonest;
    int totalRep, totalDem;

    public ElectoralDemA(Florida florida, Michigan michigan, California cali, Texas texas, NewYork newYork) {
        this.florida = florida;
        this.michigan = michigan;
        this.cali = cali;
        this.texas = texas;
        this.newYork = newYork;
        electHonest = new ElectoralHonest(florida, michigan, cali, texas, newYork);
        totalRep = electHonest.getElectRep();
        totalDem = electHonest.getElectDem();
    }


    public int getDemElectoral() {

        stateStatsDem.add(florida);
        stateStatsDem.add(newYork);
        stateStatsDem.add(cali);
        stateStatsDem.add(michigan);
        stateStatsDem.add(texas);

        IStateStats stateElect = stateStatsDem.get(0);
        int highestElect = stateStatsDem.get(0).getElect();

        for(IStateStats state : stateStatsDem)
        {
            if(state.getElect() > highestElect) {
                highestElect = state.getElect();
                stateElect = state;
            }
        }

        if(stateElect.getRep() > stateElect.getDem())
        {
            totalRep -= stateElect.getElect();
            totalDem += stateElect.getElect();
        }

        return totalDem + totalRep;

    }
}
