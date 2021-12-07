package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class ElectoralHonest implements IStrategy {

    ArrayList<State> states = new ArrayList<>();

    public ElectoralHonest(ArrayList<State> states) {
        this.states = states;
    }

    public int getRep() {
        int repElectoral = 0;

        for (State state : states) {
            if (state.getRep() > state.getDem()) {
                repElectoral += state.getElect();
            }
        }
        return repElectoral;
    }

    public int getDem() {
        int demElectoral = 0;

        for (State state : states) {
            if (state.getDem() > state.getRep()) {
                demElectoral += state.getElect();
            }
        }
        return demElectoral;
    }

}
