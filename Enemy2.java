import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy2 extends Enemy
{
    /**
     * Act - do whatever the Enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Enemy2(int speed, int rotation){
        super(speed,rotation);
    }
    
    public void act() 
    {
        // Add your action code here.
        move (this.speed);
        super.musuhMove();
        hitPeluru2();
 
    }
    
    public void hitPeluru2(){
        if (isTouching(Peluru.class)){
            MyWorld.score.add(1);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            removeTouching(Peluru.class);
            getWorld().removeObject(this);
        }
        if (isTouching(Peluru2.class)){
            MyWorld.score1.add(1);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            removeTouching(Peluru.class);
            getWorld().removeObject(this);
        }
        
    }
}
