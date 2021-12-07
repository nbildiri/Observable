package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;


public class PopularHonest implements IStrategy {

    ArrayList<State> states = new ArrayList<>();

    public PopularHonest(ArrayList<State> states) {
        this.states = states;
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
