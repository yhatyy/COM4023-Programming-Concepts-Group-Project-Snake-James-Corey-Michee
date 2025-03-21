import greenfoot.*;  

/**
 * @author (Corey Wright, James Railton, Michee Kibenge) 
 * @version (0.3)
 */

public class Snake extends Actor
{
    private int red, green, blue, player;
    private int speed = 3;
    private int count = 0;
    
    public Snake(int player, int red, int green, int blue)
    {
        setRotation(270);
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.player = player;
        getImage().setColor(new Color(red,green,blue));
        getImage().fillRect(0, 0, 40, 40);
    }
    
    public void act()
    {
        count++;
        getWorld().addObject(new Tail(red, green, blue), getX(), getY());
        move(speed);
        playerInput();
        eatFood();
        gameBoundaries();
    }
    
    private void playerInput()
    {
        if(this.player == 0){
            if(Greenfoot.isKeyDown("right")){
                setRotation(0);
            }
            if(Greenfoot.isKeyDown("left")){
                setRotation(180);
            }
            if(Greenfoot.isKeyDown("up")){
                setRotation(270);
            }
            if(Greenfoot.isKeyDown("down")){
                setRotation(90);
            }
        }
    }
    
    // Used to increase lenght of snake when food is eaten, and add eaten food to score
    private void eatFood()
    {
        if(isTouching(Food.class) && player == 0){
            MyWorld myWorld = (MyWorld) getWorld();
            myWorld.snakeCounter.addScore();
            Tail.snakeLength+= 10;
        }
    }
    
    // Used to game over if player leaves game area
    private void gameBoundaries()
    {
        if (getX() <= 0 || getX() >= getWorld().getWidth() - 1 || getY() <= 0 
        || getY() >= getWorld().getHeight() - 1)
        {
            getWorld().addObject(new YouLose(), getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
    }
}
