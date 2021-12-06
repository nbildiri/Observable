package assignment5.strategies;

import assignment5.State;
import assignment5.VotingObservable;
import assignment5.states.*;

import java.util.ArrayList;
import java.util.Observable;

public class PopularHonest{

    ArrayList<State> states = new ArrayList<>();

    public PopularHonest(ArrayList<State> states) {
        this.states.addAll(states);
    }

    public int getDem()
    {
        int demTotal = 0;

        for(State state : states)
        {
            demTotal += state.getDem();
        }
        return demTotal;
    }

    public int getRep()
    {
        int repTotal = 0;

        for(State state : states)
        {
            repTotal += state.getRep();
        }
        return repTotal;

    }

}
