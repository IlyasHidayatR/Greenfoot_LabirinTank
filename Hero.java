import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hero()
    {
      getImage().scale(40,40);
      setRotation(180);
    }
    public void act() 
    {
        // Add your action code here.
        checkCollision();
        moveANDturn();
        fireLaser();
        hitEnemy();
    }
    public void checkCollision()
    {
       Actor stone = getOneIntersectingObject(Line.class);
       if(stone!=null)
       {
            int r = getRotation();
            if(r == 0)
            {
                setLocation(getX() - 2, getY());
            }
            else if(r == 90)
            {
                setLocation(getX(), getY() - 2);
            }
            else if(r == 180)
            {
                setLocation(getX() + 2, getY());
            }
            else if(r == 270)
            {
                setLocation(getX(), getY() + 2);
            }
       }
    }
    
    public void moveANDturn()
    {   
      Actor stone = getOneIntersectingObject(Line.class);
      if(stone==null)
      {
       if(Greenfoot.isKeyDown("w"))
       {
       setLocation(getX(), getY()-2);
       setRotation(270);
       }
       else if(Greenfoot.isKeyDown("s"))
       {
       setLocation(getX(), getY()+2);
       setRotation(90);
       }
       else if(Greenfoot.isKeyDown("a"))
       {
       setLocation(getX()-2, getY());
       setRotation(180);
       }
       else if(Greenfoot.isKeyDown("d"))
       {
       setLocation(getX()+2, getY());
       setRotation(0);
       }
      }
    }
    
    int laserCounter = 0;
    private void fireLaser(){
        Peluru laser = new Peluru();
            
        if (Greenfoot.isKeyDown("Enter")){
        laserCounter++;
        if (laserCounter==30){
            //Greenfoot.playSound("Boom.mp3");
            //lokasiPeluru();
            int p = getRotation();
            if(p == 0)
            {
                laser.setRotation(0);
            }
            else if(p == 90)
            {
                laser.setRotation(90);
            }
            else if(p == 180)
            {
                laser.setRotation(180);
            }
            else if(p == 270)
            {
                laser.setRotation(270);
            }
            getWorld().addObject(laser, getX(), getY());
            laserCounter=0;
        }
    }
  }
  
    public void hitEnemy(){
        if ((isTouching(Target.class))&&((MyWorld.score.getValue())>(MyWorld.score1.getValue()))){
        getWorld().addObject(new Menang(), 300, 300);
        Greenfoot.stop();
        }
        
        if (isTouching(EnemyPeluru.class)){
            removeTouching(EnemyPeluru.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            //getWorld().Ledakan().setTime(2);
            //Greenfoot.delay(1);
           
            
            MyWorld.life.add(-1);
            if (MyWorld.life.getValue()==0){
                getWorld().addObject(new Kalah(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(500,399);
                
            }
            
            //getWorld().removeObject(this);
        }
        
        else if (isTouching(Peluru2.class)){
            removeTouching(Peluru2.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            //getWorld().Ledakan().setTime(2);
            //Greenfoot.delay(1);
           
            
            MyWorld.life.add(-1);
            if (MyWorld.life.getValue()==0){
                getWorld().addObject(new Kalah(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(500,399);
                
            }
            
            //getWorld().removeObject(this);
        }
        
        else if(isTouching(Enemy.class)){
            //removeTouching(Enemy.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            
            MyWorld.life.setValue(0);

            if (MyWorld.life.getValue()==0){
                getWorld().addObject(new Kalah(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(500,399);
            }
        }
        
        else if(isTouching(Child.class)){
            //removeTouching(Enemy.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            
            MyWorld.life.setValue(0);

            if (MyWorld.life.getValue()==0){
                getWorld().addObject(new Kalah(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(500,399);
            }
        }
        
        else if(isTouching(Enemy2.class)){
            //removeTouching(Enemy.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            
            MyWorld.life.setValue(0);

            if (MyWorld.life.getValue()==0){
                getWorld().addObject(new Kalah(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(500,399);
            }
        }
        
        else if(isTouching(Hero1.class)){
            removeTouching(Hero1.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            
            MyWorld.life.add(-1);
            if (MyWorld.life.getValue()==0){
                getWorld().addObject(new Kalah(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(500,399);
            }
        }
    }
}
