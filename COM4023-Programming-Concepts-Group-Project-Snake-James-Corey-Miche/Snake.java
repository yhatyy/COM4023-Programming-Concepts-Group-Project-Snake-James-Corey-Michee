import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (Corey Wright, James Railton, Michee Kibenge) 
 * @version (0.1)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int red, green, blue;
    public Snake(int red, int green, int blue)
    {
        setRotation(270);
        this.red = red;
        this.green = green;
        this.blue = blue;
        getImage().setColor(new Color(red,green,blue));
        getImage().fillRect(0, 0, 40, 40);
    }
    public void act()
    {
        // Add your action code here.
    }
}
