package assignment5;

public class NewYork implements IStateStats{

    private final int DEM = 4556124;
    private final int REP = 2819534;
    private final int ELECT = 29;

    @Override
    public int getDem() {
        return DEM;
    }

    @Override
    public int getRep() {
        return REP;
    }

    @Override
    public int getElect() {
        return ELECT;
    }
}
