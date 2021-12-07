package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class ElectoralRepB {
    ArrayList<State> states = new ArrayList<>();
    private final int TOOCLOSE = 1000;


    public ElectoralRepB(ArrayList<State> states) {
        this.states = states;
    }

    public int getDem() {
        ElectoralHonest electoralHonest = new ElectoralHonest(states);
        return electoralHonest.getDem();
    }

    public int getRep() {
        int repElectoral = 0;
        int diff;
        int stateOddNum;
        for (State state : states) {
            if (state.getRep() > state.getDem()) {
                repElectoral += state.getElect();
            } else {
                diff = state.getDem() - state.getRep();
                if (diff < TOOCLOSE) {
                    repElectoral += (state.getElect() % 2 == 0) ? (state.getElect() / 2) :
                            ((state.getElect() / 2) + 1);
                }
            }
        }
        return repElectoral;
    }

}

