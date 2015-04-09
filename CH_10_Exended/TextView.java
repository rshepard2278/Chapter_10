import java.awt.Color;
public class TextView implements SimulatorView
{
   
    private FieldStats stats;

    public TextView()
    {
        stats = new FieldStats();
    }

    /**
     * Define a color to be used for a given class of animal.
     * @param animalClass The animal's Class object.
     * @param color The color to be used for the given class.
     */
    public void setColor(Class animalClass, Color color) {

    }

    /**
     * Determine whether the simulation should continue to run.
     * @return true If there is more than one species alive.
     */
    public boolean isViable(Field field) {
        return stats.isViable(field);
    }

    /**
     * Show the current status of the field.
     * @param step Which iteration step it is.
     * @param field The field whose status is to be displayed.
     */
    public void showStatus(int step, Field field) {
        stats.reset();
        for(int row = 0; row < field.getDepth(); row++) {
            for(int col = 0; col < field.getWidth(); col++) {
                Object animal = field.getObjectAt(row, col);
                if(animal != null) {
                    stats.incrementCount(animal.getClass());
                }
            }
        }
        System.out.println(stats.getPopulationDetails(field));
        stats.countFinished();
    }
    
    /**
     * Prepare for a new run.
     */
    public  void reset(){

    }
}
