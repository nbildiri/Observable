package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class PopularDem implements IPopularStrategy {

    ArrayList<State> states = new ArrayList<>();

    public PopularDem(ArrayList<State> states) {
        this.states = states;
    }

    public int getPopRep() {

        State stateRep = states.get(0);
        int highestRep = states.get(0).getRep();

        for (State state : states) {
            if (state.getRep() > highestRep) {
                highestRep = state.getRep();
                stateRep = state;
            }
        }

        PopularHonest popularHonest = new PopularHonest(states);

        return popularHonest.getPopRep() - stateRep.getRep();

    }

    public int getPopDem() {
        PopularHonest popularHonest = new PopularHonest(states);
        return popularHonest.getPopDem();
    }
}
