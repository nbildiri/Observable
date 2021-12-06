package assignment5.strategies;

import assignment5.State;
import assignment5.states.*;

import java.util.ArrayList;

public class ElectoralRepA {

    ArrayList<State> states = new ArrayList<>();

    public ElectoralRepA(ArrayList<State> states) {
        this.states.addAll(states);
    }


    public int getRepElectoral() {

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