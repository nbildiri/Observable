package assignment5;

import assignment5.states.*;

public class Program {

    public static void main(String[] args) {

        VotingObservable voting = new VotingObservable();
        HonestObserver honestObserver = new HonestObserver(voting);

        Florida florida = new Florida(4504975, 4617886, 29);
        Michigan michigan = new Michigan(2268839, 2279543, 16);
        California cali = new California(8753788, 4483810,55);
        Texas texas = new Texas(3877868, 4685047, 38);
        NewYork newYork = new NewYork(4556124, 2819534, 29);

        voting.setVotes(florida, michigan, cali, texas, newYork);

        System.out.println("End Of Program.");


    }

}
