package assignment5.observers;

import assignment5.State;
import assignment5.strategies.ElectoralHonest;
import assignment5.strategies.PopularHonest;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class HonestObserver extends MainObserver implements Observer, IDisplay  {


    public HonestObserver(Observable observable) {
        observable.addObserver(this);
    }

    @Override
    public void displayPopVote() {
        strategy = new  PopularHonest(states);
        System.out.println("\nHonest Democratic Popular Vote: " + strategy.getDem());
        System.out.println("Honest Republican Popular Vote: " + strategy.getRep());

    }

    @Override
    public void displayElectVote() {
        strategy = new ElectoralHonest(states);
        System.out.println("\nHonest Democratic Electoral Vote: " + strategy.getDem());
        System.out.println("Honest Republican Electoral Vote: " + strategy.getRep());
    }

}
