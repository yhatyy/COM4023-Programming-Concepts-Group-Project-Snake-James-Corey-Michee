import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (Corey Wright, James Railton, Michee Kibenge) 
 * @version (0.1)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    Snake playerSnake = new Snake(0,255,0);
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(playerSnake, 450, 300);
        
    }
}
