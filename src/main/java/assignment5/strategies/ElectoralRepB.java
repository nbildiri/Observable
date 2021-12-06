package assignment5.strategies;

import assignment5.State;
import assignment5.states.*;

import java.util.ArrayList;

public class ElectoralRepB {
    ArrayList<State> states = new ArrayList<>();
    int repElectoral = 0;

    public ElectoralRepB(ArrayList<State> states) {
        this.states.addAll(states);
    }

    public int getRepElectoral() {
        repElectoral = floridaElectoral() + michiganElectoral() + californiaElectoral() + newyorkElectoral() + texasElectoral();

        return repElectoral;
    }

    public int floridaElectoral() {
        int diff;
        int floridaRepElectoral = 0;
        if (florida.getRep() > florida.getDem()) {
            floridaRepElectoral = florida.getElect();
            return floridaRepElectoral;
        } else {
            diff = florida.getDem() - florida.getRep();
            if (diff < 1000) {
                floridaRepElectoral = florida.getElect() / 2;
                return floridaRepElectoral;
            }
        }
        return floridaRepElectoral;
    }

    public int michiganElectoral() {
        int diff;
        int michiganRepElectoral = 0;
        if (michigan.getRep() > michigan.getDem()) {
            michiganRepElectoral = michigan.getElect();
            return michiganRepElectoral;
        } else {
            diff = michigan.getDem() - michigan.getRep();
            if (diff < 1000) {
                michiganRepElectoral = michigan.getElect() / 2;
                return michiganRepElectoral;
            }
        }
        return michiganRepElectoral;
    }

    public int newyorkElectoral() {
        int diff;
        int newyorkRepElectoral = 0;
        if (newYork.getRep() > newYork.getDem()) {
            newyorkRepElectoral = newYork.getElect();
            return newyorkRepElectoral;
        } else {
            diff = newYork.getDem() - newYork.getRep();
            if (diff < 1000) {
                newyorkRepElectoral = newYork.getElect() / 2;
                return newyorkRepElectoral;
            }
        }
        return newyorkRepElectoral;
    }

    public int texasElectoral() {
        int diff;
        int texasRepElectoral = 0;
        if (texas.getRep() > texas.getDem()) {
            texasRepElectoral = texas.getElect();
            return texasRepElectoral;
        } else {
            diff = texas.getDem() - texas.getRep();
            if (diff < 1000) {
                texasRepElectoral = texas.getElect() / 2;
                return texasRepElectoral;
            }
        }
        return texasRepElectoral;
    }

    public int californiaElectoral() {
        int diff;
        int californiaRepElectoral = 0;
        if (cali.getRep() > cali.getDem()) {
            californiaRepElectoral = cali.getElect();
            return californiaRepElectoral;
        } else {
            diff = cali.getDem() - cali.getRep();
            if (diff < 1000) {
                californiaRepElectoral = cali.getElect() / 2;
                return californiaRepElectoral;
            }
        }
        return californiaRepElectoral;
    }

}
