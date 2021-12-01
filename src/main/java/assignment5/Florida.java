package assignment5;

public class Florida implements IStateStats{

    private final int DEM = 4504975;
    private final int REP = 4617886;
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
