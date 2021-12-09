package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class ElectoralDemA implements IElectoralStrategy {

    ArrayList<State> states = new ArrayList<>();
    ElectoralHonest electHonest;
    int totalRep, totalDem;

    public ElectoralDemA(ArrayList<State> states) {
        this.states = states;
        electHonest = new ElectoralHonest(states);
        totalRep = electHonest.getElectRep();
        totalDem = electHonest.getElectDem();
    }


    public int getElectDem() {

       State stateElect = getHighest();
        if(stateElect.getRep() > stateElect.getDem())
        {
            totalDem += stateElect.getElect();
        }
        return totalDem;
    }

    public int getElectRep(){
        State stateElect = getHighest();

        if(stateElect.getRep() > stateElect.getDem())
        {
            totalRep -= stateElect.getElect();
        }
        return totalRep;
    }

    public State getHighest()
    {
        State stateElect = states.get(0);
        int highestElect = states.get(0).getElect();

        for(State state : states)
        {
            if(state.getElect() > highestElect) {
                highestElect = state.getElect();
                stateElect = state;
            }
        }
        return stateElect;
    }

}
