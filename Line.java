import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (AryutinFoltus)
 */
public class Line extends Actor
{ 

    public void act() 
    {
        //Lose();
        if (isTouching(Peluru.class)){
            removeTouching(Peluru.class);
        }
        /*else if (isTouching(EnemyPeluru.class)){
            removeTouching(EnemyPeluru.class);
        }*/
        else if (isTouching(Peluru2.class)){
            removeTouching(Peluru2.class);
        }
        
    }
    private static final int EAST = 0;
    private static final int WEST = 1;
    private static final int NORTH = 2;
    private static final int SOUTH = 3;

    private int direction;  
    public void turnLeft()
    {
        switch(direction) {
            case SOUTH :
            setDirection(EAST);
            break;
            case EAST :
            setDirection(NORTH);
            break;
            case NORTH :
            setDirection(WEST);
            break;
            case WEST :
            setDirection(SOUTH);
            break;
        }
        
    }
    
    public void setDirection(int direction)
    {
        if ((direction >= 0) && (direction <= 3)) {
            this.direction = direction;
        }
        switch(direction) {
            case SOUTH :
            setRotation(90);
            break;
            case EAST :
            setRotation(0);
            break;
            case NORTH :
            setRotation(270);
            break;
            case WEST :
            setRotation(180);
            break;
            default :
            break;
        }
    }

} 
