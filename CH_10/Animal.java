
import java.util.List;

public abstract class Animal
{

    private boolean alive;
    private Location location;
    private Field field;
   
    public Animal(boolean randomAge, Field field, Location location) {
        alive = true;
        this.field = field;
        setLocation(location);       
    }

     public boolean isAlive()
    {
        return alive;
    }
    
    public void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }

    public Location getLocation()
    {
        return location;
    }

    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }

    public Field getField() {
        return field;
    }

    abstract public void act(List<Animal> newAnimals);

}
