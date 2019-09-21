import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Spider1 extends Organism 
{

    /**
     * Act - do whatever the Spider1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int num;
    private double ratio = 1;
    public void act()
    {
        if ( isAtEdge() )
        {
            turn(30);
        }

        if ( Greenfoot.getRandomNumber(300) < 10 )
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }

        move(1);

        if (isTouching(Lizard.class) )
        {
            Greenfoot.playSound("Eating.wav");
            removeTouching(Lizard.class);
        }
       num = getWorld().getObjects(Spider1.class).size();
    }
    public double SpawnRate(int num)
    {
        return num * ratio; 
    }
    public int getNum() 
    {
        return num;
    }
}
