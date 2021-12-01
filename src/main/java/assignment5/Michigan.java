package assignment5;

public class Michigan implements IStateStats{

    private final int DEM = 2268839;
    private final int REP = 2279543;
    private final int ELECT = 16 ;

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
