package assignment5;

import assignment5.observers.HonestObserver;

import java.util.ArrayList;

public class ProgramMain {

    public static void main(String[] args) {

        VotingObservable voting = new VotingObservable();
        HonestObserver honestObserver = new HonestObserver(voting);

        ArrayList<State> states = new ArrayList<>();

        states.add(new State("Florida", 4504975, 4617886, 29));
        states.add(new State("Michigan", 2268839, 2279543, 16));
        states.add(new State("California", 8753788, 4483810,55));
        states.add(new State("Texas",3877868, 4685047, 38));
        states.add(new State("New York" , 4556124, 2819534, 29));

        voting.setVotes(states);

        //TODO fill in the 4 new observers
        //TODO Fill out ElectoralDemB Strategy

        System.out.println("End Of Program.");


    }

}
