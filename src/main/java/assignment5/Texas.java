package assignment5;

public class Texas implements IStateStats{

    private final int DEM = 3877868;
    private final int REP = 4685047;
    private final int ELECT = 38;

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
