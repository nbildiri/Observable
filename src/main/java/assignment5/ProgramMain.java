package assignment5;

import assignment5.observers.DemocraticFavoringObserver2;
import assignment5.observers.HonestObserver5;
import assignment5.observers.RepublicanElectoralFavoringObserver3;
import assignment5.observers.RepublicanFavoringObserver1;

import java.util.ArrayList;

public class ProgramMain {

    public static void main(String[] args) {

        VotingObservable voting = new VotingObservable();
        HonestObserver5 honestObserver = new HonestObserver5(voting);
        DemocraticFavoringObserver2 democraticFavoringObserver = new DemocraticFavoringObserver2(voting);
        RepublicanElectoralFavoringObserver3 republicanElectoralFavoringObserver3 = new RepublicanElectoralFavoringObserver3(voting);
        DemocraticFavoringObserver2 democraticFavoringObserver2 = new DemocraticFavoringObserver2(voting);
        RepublicanFavoringObserver1 republicanFavoringObserver1 = new RepublicanFavoringObserver1(voting);

        ArrayList<State> states = new ArrayList<>();

        states.add(new State("Florida", 4504975, 4617886, 29));
        states.add(new State("Michigan", 2268839, 2279543, 16));
        states.add(new State("California", 8753788, 4483810,55));
        states.add(new State("Texas",3877868, 4685047, 38));
        states.add(new State("New York" , 4556124, 2819534, 29));

        voting.setVotes(states);


        System.out.println("\n*** Observations of Five States. ***");

        states.add(new State("Arizona", 4134581, 3617786, 19));
        states.add(new State("Utah", 23166819, 2573523, 22));
        states.add(new State("Nevada", 6753788, 4283810,38));
        states.add(new State("Illinois",5877868, 4685047, 44));
        states.add(new State("Colorado" , 4352824, 3110534, 10));

        voting.setVotes(states);

        System.out.println("\n*** Observations of Ten States. ***");


        states.removeAll(states);

        states.add(new State("Utah", 23166819, 2573523, 22));
        states.add(new State("California", 8753788, 4483810,55));
        states.add(new State("New York" , 4556124, 2819534, 29));
        states.add(new State("Illinois",5877868, 4685047, 44));
        states.add(new State("Virginia",2877868, 3285047, 18));

        voting.setVotes(states);

        System.out.println("\n*** Observations of Five States. ***");

    }

}
