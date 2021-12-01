package assignment5;

public class PopularRep {

   PopularHonest popularHonest = new PopularHonest();

   public int getPopularRep()
   {
       return (int) (popularHonest.getRep() + (popularHonest.getDem() - popularHonest.getDem() * .05));
   }

}
