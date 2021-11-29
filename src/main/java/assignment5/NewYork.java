package assignment5;

public class NewYork implements IStateStats{

    private final int DEM = 555;
    private final int REP = 555;
    private final int ELECT = 55;

    @Override
    public int demStat() {
        return DEM;
    }

    @Override
    public int repStat() {
        return REP;
    }

    @Override
    public int electoralStat() {
        return ELECT;
    }
}
