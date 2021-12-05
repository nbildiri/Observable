package assignment5.strategies;

import assignment5.states.*;

public class ElectoralRepA {

    Florida florida;
    Michigan michigan;
    California cali;
    Texas texas;
    NewYork newYork;
    int repElectoral;

    public ElectoralRepA(Florida florida, Michigan michigan, California cali, Texas texas, NewYork newYork) {
        this.florida = florida;
        this.michigan = michigan;
        this.cali = cali;
        this.texas = texas;
        this.newYork = newYork;
    }


    public int getRepElectoral() {
        repElectoral = michigan.getElect();
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
        return repElectoral;
    }
}