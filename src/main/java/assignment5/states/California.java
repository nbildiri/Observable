package assignment5.states;

import assignment5.states.IStateStats;

public class California implements IStateStats {

    private int dem;
    private int rep;
    private int elect;

    public California(int dem, int rep, int elect) {
        this.dem = dem;
        this.rep = rep;
        this.elect = elect;
    }

    @Override
    public int getDem() {
        return dem;
    }

    @Override
    public int getRep() {
        return rep;
    }

    @Override
    public int getElect() {
        return elect;
    }
}
