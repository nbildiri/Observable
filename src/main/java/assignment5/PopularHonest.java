package assignment5;

import java.awt.image.ImageObserver;
import java.util.Observable;

public class PopularHonest extends Observable{

    Florida florida = new Florida();
    NewYork newyork = new NewYork();
    California cali = new California();
    Michigan michigan = new Michigan();
    Texas texas = new Texas();

    public int getDem()
    {
        return florida.getDem() + newyork.getDem() + cali.getDem() + michigan.getDem() + texas.getDem();
    }

    public int getRep()
    {
        return florida.getRep() + newyork.getRep() + cali.getRep() + michigan.getRep() + texas.getRep();
    }




}
