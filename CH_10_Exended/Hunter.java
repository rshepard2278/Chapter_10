import java.util.List;
import java.util.Random;


public class Hunter implements Actor
{

    private Field field;
    private Location location;
    private boolean active;
    private static final Random rand = Randomizer.getRandom();
  
    public Hunter(boolean active, Field field, Location location) {
        this.active = active;
        this.field = field;
        this.location = location;
    }   
    
    public void act(List<Actor> actors) {
        if(rand.nextDouble() > 0.5) {
            for(int shots = 5; shots > 0; shots--) {
                int row = rand.nextInt(field.getDepth());
                int col = rand.nextInt(field.getWidth());
                Actor prey = (Actor)field.getObjectAt(row, col);
                //prey.setActive(false);
                field.clear(new Location(row, col));
            }
        }
    }

    public void setActive(boolean active) {
        this.active = true;
    }

    public boolean isActive() {
        return active;
    }
}
