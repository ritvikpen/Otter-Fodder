import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lizard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lizard extends Actor
{
    private int score;
    private int time;
    public static Bomb existingBomb;
    /**
     * Act - do whatever the Lizard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(5);
        if ( Greenfoot. isKeyDown("right") ){
            turn(5);
        }
        if ( Greenfoot. isKeyDown("left") ){
            turn(-5);    
        }
        if ( Greenfoot. isKeyDown("f") ){
            if (existingBomb == null){
                Bomb bomb = new Bomb();
                getWorld().addObject(new Bomb(), getX(), getY());
                existingBomb = bomb;
            }
        }

        eatBanana();
        score = 0;
    }

    public void eatBanana()
    {
        if (isTouching(Banana.class) )
        {
            Ground ground = (Ground)getWorld();
            ground.addScore(1);
            Greenfoot.playSound("EatingBanana.wav");
            removeTouching(Banana.class);

        }
    }

    public void countTime()
    {
        time--;
        if (time == 0)
        {

        }
    }
}
