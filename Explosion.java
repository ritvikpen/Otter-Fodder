import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Explosion extends Actor
{
    private int time = 40;
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (isTouching(Spider1.class) )
        {
            Ground ground = (Ground)getWorld();
            ground.addScore(5);
            removeTouching(Spider1.class);
        }    
        
        time--;
        if (time <= 0)
        {
            getWorld().removeObject(this);
        }
    }
}
