package assignment5.observers;

import assignment5.State;
import assignment5.VotingObservable;
import assignment5.strategies.*;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class DemocratsPopularFavoringObserver4 extends MainObserver implements Observer, IDisplay {



    public DemocratsPopularFavoringObserver4(Observable observable) {
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
        electoralStrategy = new ElectoralHonest(states);
        System.out.println("\nHonest Favoring Electoral: \nHonest Electoral Vote: " + electoralStrategy.getElectDem());
        System.out.println("Honest Electoral Vote: " + electoralStrategy.getElectRep());
    }

}

