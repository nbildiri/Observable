package assignment5;

public class ElectoralHonest {

    Florida florida = new Florida();
    NewYork newyork = new NewYork();
    California cali = new California();
    Michigan michigan = new Michigan();
    Texas texas = new Texas();

    public int getElect()
    {
        return florida.getElect() + newyork.getElect() + cali.getElect() + michigan.getElect() + texas.getElect();
    }

}
