package assignment5;

public class PopularDem {

    Florida florida = new Florida();
    NewYork newyork = new NewYork();
    California cali = new California();
    Michigan michigan = new Michigan();
    Texas texas = new Texas();


    public int getDem()
    {
        int popular = florida.getDem() + newyork.getDem() + cali.getDem() + michigan.getDem() + texas.getDem();
    }
}
