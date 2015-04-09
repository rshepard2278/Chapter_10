
public class Rank implements Comparable<Rank> {

    private int rank;

    public Rank(int rank)
    {
        this.rank = rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }
     
    @Override
    public int compareTo(Rank testRank) {
        int returnValue = 0;
        if(this.rank == testRank.getRank()) {
            returnValue = 0;
        } else if(this.rank < testRank.getRank()) {
            returnValue = -1; 
        } else {
            returnValue = 1;
        }
        return returnValue;
    }
}
