package assignment5.observers;

import assignment5.State;
import assignment5.strategies.ElectoralHonest;
import assignment5.strategies.PopularHonest;

import java.util.Observable;
import java.util.Observer;

public class HonestObserver5 extends MainObserver implements Observer, IDisplay  {


    public HonestObserver5(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void displayPopVote() {
         popularStrategy = new  PopularHonest(states);
        System.out.println("\nHonest Popular: \nDemocratic Popular Vote: " + popularStrategy.getPopDem());
        System.out.println("Republican Popular Vote: " + popularStrategy.getPopRep());

    }

    @Override
    public void displayElectVote() {
        electoralStrategy = new ElectoralHonest(states);
        System.out.println("\nHonest Electoral: \nDemocratic Electoral Vote: " + electoralStrategy.getElectDem());
        System.out.println("Republican Electoral Vote: " + electoralStrategy.getElectRep());
    }

}
