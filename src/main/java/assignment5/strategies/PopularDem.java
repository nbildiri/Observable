package assignment5.strategies;

import assignment5.State;
import assignment5.states.*;

import java.util.ArrayList;
import java.util.Collections;

public class PopularDem {

    ArrayList<State> states = new ArrayList<>();
    ArrayList<Integer> stateStatsRep = new ArrayList<>();

    public PopularDem(ArrayList<State> states) {
        this.states.addAll(states);
    }

    public int getDem() {

        State stateRep = states.get(0);
        int highestRep = states.get(0).getRep();

        for(State state : states)
        {
            if(state.getRep() > highestRep) {
                highestRep = state.getRep();
                stateRep = state;
            }
        }

        PopularHonest popularHonest = new PopularHonest(states);

        int popularRep = popularHonest.getRep() - stateRep.getRep();

        return popularRep + popularHonest.getDem();

    }
}
