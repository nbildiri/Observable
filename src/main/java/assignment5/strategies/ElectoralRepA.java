package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class ElectoralRepA implements IElectoralStrategy {

    ArrayList<State> states = new ArrayList<>();

    public ElectoralRepA(ArrayList<State> states) {
        this.states = states;
    }

    public int getElectDem(){

        int totalDem;
        ElectoralHonest electoralHonest = new ElectoralHonest(states);
        if(states.get(4).getDem() > states.get(4).getRep())
        {
            totalDem = electoralHonest.getElectDem() - states.get(4).getElect();
        }
        else {
            totalDem = electoralHonest.getElectDem();
        }
        return totalDem;
    }

    public int getElectRep() {
        int repElectoral;

        if(states.get(4).getRep() > states.get(4).getDem())
        {
           repElectoral = 0;
        }
        else {
            //states.get(4) will always be republican
            repElectoral = states.get(4).getElect();


            for (int i = 0; i < states.size() - 1; i++) {
                if (states.get(i).getRep() > states.get(i).getDem()) {
                    repElectoral += states.get(i).getElect();
                }
            }
        }
        return repElectoral;
    }

}