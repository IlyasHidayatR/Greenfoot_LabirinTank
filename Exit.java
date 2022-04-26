import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Actor
{
    /**
     * Act - do whatever the Exit wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            Greenfoot.stop();
            //getImage().scale((int)Math.round(getImage().getWidh()+0.9),(int)Mat);
        }
        else if(Greenfoot.mouseClicked(this)){
            Greenfoot.stop();
            //((Gameover)getWorld()).ggl.stop();
            //Greenfoot.setWorld(new background());
        }
    }    
}
