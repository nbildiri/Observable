package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class PopularRep implements IStrategy {

    ArrayList<State> states = new ArrayList<>();

    public PopularRep(ArrayList<State> states) {
        this.states = states;
        }

    public int getRep()
    {
        PopularHonest popularHonest = new PopularHonest(states);
        return popularHonest.getRep();
    }


    public int getDem() {
        PopularHonest popularHonest = new PopularHonest(states);
        return (int) ((popularHonest.getDem() - popularHonest.getDem() * .05));
    }

}
