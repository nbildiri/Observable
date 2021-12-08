package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class PopularRep implements IPopularStrategy {

    ArrayList<State> states = new ArrayList<>();

    public PopularRep(ArrayList<State> states) {
        this.states = states;
        }

    public int getPopRep()
    {
        PopularHonest popularHonest = new PopularHonest(states);
        return popularHonest.getPopRep();
    }


    public int getPopDem() {
        PopularHonest popularHonest = new PopularHonest(states);
        return (int) ((popularHonest.getPopDem() - (popularHonest.getPopDem() * .05)));
    }

}
