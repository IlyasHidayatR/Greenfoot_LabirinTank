import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Keluar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Keluar extends Actor
{
    /**
     * Act - do whatever the Keluar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Keluar()
    {
      getImage().scale(200,100);
      //setRotation(180);
    }
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(this)){
            Greenfoot.setWorld(new menu());
            //getImage().scale((int)Math.round(getImage().getWidh()+0.9),(int)Mat);
        }
        else if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new menu());
            //((Gameover)getWorld()).ggl.stop();
            //Greenfoot.setWorld(new background());
        }
    }    
}
