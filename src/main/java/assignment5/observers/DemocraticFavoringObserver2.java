package assignment5.observers;

import assignment5.State;
import assignment5.VotingObservable;
import assignment5.strategies.ElectoralDemA;
import assignment5.strategies.PopularDem;
import assignment5.strategies.PopularRep;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class DemocraticFavoringObserver2 extends MainObserver implements Observer, IDisplay {


    public DemocraticFavoringObserver2(Observable observable) {
        observable.addObserver(this);
    }


    @Override
    public void displayPopVote() {
        popularStrategy = new PopularDem(states);
        System.out.println("\nDemocratic Favoring Popular: \nDemocratic Popular Vote: " + popularStrategy.getPopDem());
        System.out.println("Republican Popular Vote: " + popularStrategy.getPopRep());
    }

    @Override
    public void displayElectVote() {
        electoralStrategy = new ElectoralDemA(states);
        System.out.println("\nDemocratic Favoring Electoral: \nDemocratic Electoral Vote: " + electoralStrategy.getElectDem());
        System.out.println("Republican Electoral Vote: " + electoralStrategy.getElectRep());
    }

}
