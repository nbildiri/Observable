package assignment5;

public class State {
    private String state;
    private int dem;
    private int rep;
    private int elect;

    public State(String state,  int dem, int rep, int elect)
    {
        this.state= state;
        this.dem = dem;
        this.rep = rep;
        this.elect = elect;
    }

    public int getDem() {
        return dem;
    }


    public int getRep() {
        return rep;
    }


    public int getElect() {
        return elect;
    }

}

