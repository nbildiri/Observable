package assignment5.strategies;

import assignment5.State;
import assignment5.states.*;

import java.util.ArrayList;

public class PopularRep {

    ArrayList<State> states = new ArrayList<>();

    public PopularRep(ArrayList<State> states) {
        this.states.addAll(states);
    }


    public int getPopularRep() {
        PopularHonest popularHonest = new PopularHonest(states);
        return (int) (popularHonest.getRep() + (popularHonest.getDem() - popularHonest.getDem() * .05));
    }

}
