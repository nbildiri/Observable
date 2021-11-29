package assignment5;

public class Texas implements IStateStats{

    private final int DEM = 555;
    private final int REP = 555;
    private final int ELECT =555;

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
