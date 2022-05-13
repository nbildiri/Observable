package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class ElectoralRepB implements IElectoralStrategy{
    ArrayList<State> states = new ArrayList<>();
    private final int TOOCLOSE = 1000;


    public ElectoralRepB(ArrayList<State> states) {
        this.states = states;
    }

    public int getElectDem() {
        ElectoralHonest electoralHonest = new ElectoralHonest(states);
        return electoralHonest.getElectDem();
    }

    public int getElectRep() {
        int repElectoral = 0;
        int diff;
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

