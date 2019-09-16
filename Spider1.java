import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spider1 extends Villain
{
    
    /**
     * Act - do whatever the Spider1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if ( isAtEdge() )
        {
            turn(30);
        }
        
        if ( Greenfoot.getRandomNumber(100) < 10 )
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        
        move(1);
        
        if (isTouching(Lizard.class) )
        {
            Greenfoot.playSound("Eating.wav");
            removeTouching(Lizard.class);
        }    
        
    }    
}
