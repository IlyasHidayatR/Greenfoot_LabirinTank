import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Peluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Peluru extends Actor
{
    /**
     * Act - do whatever the Peluru wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        move(10);
        
        if (isAtEdge()){
            getWorld().removeObject(this);
        }
        
        
    }
    /*public void removeWall(){
        if (isTouching(Line.class)){
            getWorld().removeObject(this);
        }
        else if (isTouching(Enemy.class)){
           
           getWorld().removeObject(this);
        }
    }*/
}
