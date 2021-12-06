package assignment5.strategies;

import assignment5.State;
import assignment5.states.*;

import java.util.ArrayList;

public class ElectoralDemA {

    ArrayList<State> states = new ArrayList<>();
    ElectoralHonest electHonest;
    int totalRep, totalDem;

    public ElectoralDemA(ArrayList<State> states) {
        this.states.addAll(states);
        electHonest = new ElectoralHonest(states);
        totalRep = electHonest.getElectRep();
        totalDem = electHonest.getElectDem();
    }


    public int getDemElectoral() {


        State stateElect = states.get(0);
        int highestElect = states.get(0).getElect();

        for(State state : states)
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
