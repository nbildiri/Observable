package assignment5.strategies;

import assignment5.State;

import java.util.ArrayList;

public class ElectoralDemB implements IElectoralStrategy {

    ArrayList<State> states = new ArrayList<>();
    ElectoralHonest electHonest;
    double twoPercentRep;

    public ElectoralDemB(ArrayList<State> states) {
        this.states = states;
    }


    public int getElectDem() {

        electHonest = new ElectoralHonest(states);
        twoPercentRep = electHonest.getElectRep() *.02;
        return (int) (electHonest.getElectDem() + twoPercentRep);
    }

    public int getElectRep() {
        electHonest = new ElectoralHonest(states);
        twoPercentRep = electHonest.getElectRep() *.02;
        return (int) (electHonest.getElectRep() - twoPercentRep);
    }
}
