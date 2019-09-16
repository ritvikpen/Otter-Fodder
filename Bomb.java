import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bomb extends Actor
{
    private int timer = 100;
   
    
    
    
    /**
     * Act - do whatever the Bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        timer--;
        if (timer <= 0)
        {
            getWorld().addObject(new Explosion(), getX(), getY());
            Greenfoot.playSound("ExplosionSound.wav");
            Lizard.existingBomb = null;
            getWorld().removeObject(this);
        }   
        
    }
}