import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ground extends World
{
    private int score;
    private int time;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Ground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1200, 600, 1); 
        prepare();
        score = 0;
        time = 5;
        showScore();
        
        
    }

    public void act()
    {
        Banana banana = new Banana();
        if (Greenfoot.getRandomNumber(1600) < 10)
        {
            addObject(new Banana(), Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(600));
        }
        
        if (Greenfoot.getRandomNumber(1600) < 05)
        {
            addObject(new Spider1(), 30, 30);
        }
        Kelp kelp = new Kelp();
        if (Greenfoot.getRandomNumber(1600)<20)
        {
            addObject(new Kelp(), Greenfoot.getRandomNumber(1200), Greenfoot.getRandomNumber(600));
        }
    }
    public void addScore(int points)
    {
        score = score + points;
        showScore();
        if (score < 0)
        {
            Greenfoot.stop();
        }
    }
    private void showScore()
    {
        showText("Score: " + score, 80, 25);
        score = score;
    }
    private void showEndMessage()
    {
        showText("Game Over", 390, 150);
        showText("Your final score: "+ score + " points", 390, 170);
    }
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Lizard lizard = new Lizard();
        addObject(lizard,224,189);
        Spider1 spider1 = new Spider1();
        addObject(spider1,100,358);
        //Egg egg = new Egg();
        //addObject(egg,30,30);
        Spider1 spider12 = new Spider1();
        addObject(spider12,427,314);
        Spider1 spider13 = new Spider1();
        addObject(spider13,523,159);
        Spider1 spider14 = new Spider1();
        addObject(spider14,388,79);
        Spider1 spider15 = new Spider1();
        addObject(spider15,77,162);
        removeObject(spider12);
        removeObject(spider13);
        removeObject(spider14);
        removeObject(spider15);
    }
}
