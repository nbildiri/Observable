package assignment5;

public class Florida implements IStateStats{

    private final int DEM = 4504975;
    private final int REP = 4617886;
    private final int ELECT = 29;

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
