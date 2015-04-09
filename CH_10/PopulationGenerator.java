import java.util.Random;
import java.util.List;


public class PopulationGenerator
{

    private static Field field;
    private static List<Animal> animals;
    private static final double FOX_CREATION_PROBABILITY = 0.02;
    private static final double RABBIT_CREATION_PROBABILITY = 0.08;   
  
    public PopulationGenerator(Field field, List<Animal> animals) {
            this.field = field;
            this.animals = animals;
            field.clear();
    }

    public static void populate() {
        Random rand = Randomizer.getRandom();
        
        for(int row = 0; row < field.getDepth(); row++) {
            for(int col = 0; col < field.getWidth(); col++) {
                if(rand.nextDouble() <= FOX_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Fox fox = new Fox(true, field, location);
                    animals.add(fox);
                }
                else if(rand.nextDouble() <= RABBIT_CREATION_PROBABILITY) {
                    Location location = new Location(row, col);
                    Rabbit rabbit = new Rabbit(true, field, location);
                    animals.add(rabbit);
                }
                // else leave the location empty.
            }
        }
    }

}
