import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.lang.Math;
/**
 * Write a description of class Banana here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Banana extends Organism
{
    /**
     * Act - do whatever the Banana wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int num; 
    private double ratio = 1;
    public void act() 
    {
        // Add your action code here.
        for (Banana b : getWorld().getObjects(Banana.class)) 
        { 
            if(b.getNearestKelp().getX() > b.getX()){
                setLocation(b.getX()+10, b.getY());
            }
            else{
                setLocation(b.getX()-10, b.getY());
            }
            if(b.getNearestKelp().getY() > b.getY()){
                setLocation(b.getX(), b.getY()+10);
            }
            else{
                setLocation(b.getX(), b.getY()-10);
            }
        }
    }    
    public double SpawnRate (int num) 
    {
        return num * ratio; 
    }
    public int getNum() 
    {
        return num;
    }
    public greenfoot.Actor getNearestKelp()                  
    {  
        List<Kelp> nearActors = getObjectsInRange(1600, Kelp.class);  
        Actor nearestActor = null;  
        double nearestDistance = 40;  
        double distance;   
        for (int i = 0; i < nearActors.size(); i++)  
        {  
            distance = getDistance(nearActors.get(i));  
            if (distance < nearestDistance)  
            {  
                nearestActor = nearActors.get(i);  
                nearestDistance = distance;  
            }  
        }  
      return nearestActor;
  }
  public double getDistance(Actor actor) {
      return Math.hypot(actor.getX() - getX(), actor.getY() - getY());
  }
}
