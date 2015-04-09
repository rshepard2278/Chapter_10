import java.util.ArrayList;


public class TestComparable
{
   private ArrayList<Rank> ranks;

   TestComparable() {
       ranks = new ArrayList<>();
       for(int i = 0; i < 100; i++) {
           ranks.add(new Rank(i));
        }
    }

   public void compareRanks() {
       Rank previousRank = new Rank(77);
       for(Rank rank : ranks) {
          System.out.println("Rank " + rank.getRank() + " is " + rank.compareTo(previousRank) + " when compared to " + previousRank.getRank());
          previousRank = rank;
        }
    }
}
