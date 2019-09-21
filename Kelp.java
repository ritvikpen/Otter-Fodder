import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Kelp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Kelp extends Organism
{
    /**
     * Act - do whatever the Kelp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int num; 
    private double ratio = 1;
    public void act() 
    {
        // Add your action code here.
        num = getWorld().getObjects(Spider1.class).size();
    }    
    public double SpawnRate (int num) 
    {
        return num * ratio; 
    }
    public int getNum() 
    {
        return num;
    }
}
