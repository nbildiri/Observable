package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class ElectoralRepA implements IStrategy {

    ArrayList<State> states = new ArrayList<>();

    public ElectoralRepA(ArrayList<State> states) {
        this.states = states;
    }

    public int getDem(){
        ElectoralHonest electoralHonest = new ElectoralHonest(states);
        return electoralHonest.getDem();
    }

    public int getRep() {

        //states.get(0) will always be republican
        int repElectoral = states.get(0).getElect();

        //for loop will start from 1
        for (int i = 1; i < states.size(); i++) {
            if(states.get(i).getRep() > states.get(i).getDem()) {
                repElectoral += states.get(i).getElect();
            }
        }
        return repElectoral;
    }

}