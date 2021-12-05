package assignment5.strategies;

import assignment5.states.*;

public class ElectoralHonest {

    Florida florida;
    Michigan michigan;
    California cali;
    Texas texas;
    NewYork newYork;

    public ElectoralHonest(Florida florida, Michigan michigan, California cali, Texas texas, NewYork newYork) {
        this.florida = florida;
        this.michigan = michigan;
        this.cali = cali;
        this.texas = texas;
        this.newYork = newYork;
    }

    public int getElect()
    {
        return florida.getElect() + newYork.getElect() + cali.getElect() + michigan.getElect() + texas.getElect();
    }

    public int getElectRep()
    {
        int repElectoral = 0;

        if(florida.getRep() > florida.getDem()) {
            repElectoral += florida.getElect();
        }
        if(newYork.getRep() > newYork.getDem()) {
            repElectoral += newYork.getElect();
        }
        if(cali.getRep() > cali.getDem()) {
            repElectoral += cali.getElect();
        }
        if(texas.getRep() > texas.getDem()) {
            repElectoral += texas.getElect();
        }
        if(michigan.getRep() > michigan.getDem()) {
            repElectoral += texas.getElect();
        }

        return  repElectoral;
    }

    public int getElectDem()
    {
        int repElectoral = 0;

        if(florida.getDem() > florida.getRep()) {
            repElectoral += florida.getElect();
        }
        if(newYork.getDem() > newYork.getRep()) {
            repElectoral += newYork.getElect();
        }
        if(cali.getDem() > cali.getRep()) {
            repElectoral += cali.getElect();
        }
        if(texas.getDem() > texas.getRep()) {
            repElectoral += texas.getElect();
        }
        if(michigan.getDem() > michigan.getRep()) {
            repElectoral += texas.getElect();
        }

        return  repElectoral;
    }

}
