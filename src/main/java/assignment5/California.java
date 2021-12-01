package assignment5;

public class California implements IStateStats{

    private final int DEM = 8753788;
    private final int REP = 4483810;
    private final int ELECT = 55 ;

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
