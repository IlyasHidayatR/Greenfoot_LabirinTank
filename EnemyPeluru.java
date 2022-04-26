import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class EnemyPeluru here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyPeluru extends Actor
{
    /**
     * Act - do whatever the EnemyPeluru wants to do. This method is called whenever
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
}
