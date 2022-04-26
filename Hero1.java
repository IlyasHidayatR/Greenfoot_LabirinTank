import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero1 extends Hero
{
    /**
     * Act - do whatever the Hero1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Hero1()
    {
      getImage().scale(40,40);
      setRotation(0);
    }
    
    public void act() 
    {
        // Add your action code here.
        super.checkCollision();
        moveANDturn();
        fireLaser();
        hitEnemy();
    }
    
    public void moveANDturn()
    {   
      Actor stone = getOneIntersectingObject(Line.class);
      if(stone==null)
      {
       if(Greenfoot.isKeyDown("Up"))
       {
       setLocation(getX(), getY()-2);
       setRotation(270);
       }
       else if(Greenfoot.isKeyDown("Down"))
       {
       setLocation(getX(), getY()+2);
       setRotation(90);
       }
       else if(Greenfoot.isKeyDown("Left"))
       {
       setLocation(getX()-2, getY());
       setRotation(180);
       }
       else if(Greenfoot.isKeyDown("Right"))
       {
       setLocation(getX()+2, getY());
       setRotation(0);
       }
      }
    }
    
    int laserCounter = 0;
    private void fireLaser(){
        Peluru2 laser = new Peluru2();
            
        if (Greenfoot.isKeyDown("Space")){
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
        if ((isTouching(Target1.class))&&((MyWorld.score.getValue())<(MyWorld.score1.getValue())))
        {
        getWorld().addObject(new Kalah(), 300, 300);
        Greenfoot.stop();
        }
        
        if (isTouching(EnemyPeluru.class)){
            removeTouching(EnemyPeluru.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            //getWorld().Ledakan().setTime(2);
            //Greenfoot.delay(1);
           
            
            MyWorld.life1.add(-1);
            if (MyWorld.life1.getValue()==0){
                getWorld().addObject(new Menang(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(50, 180);
                
            }
            
            //getWorld().removeObject(this);
        }
        
        else if (isTouching(Peluru.class)){
            removeTouching(Peluru.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            //getWorld().Ledakan().setTime(2);
            //Greenfoot.delay(1);
           
            
            MyWorld.life1.add(-1);
            if (MyWorld.life1.getValue()==0){
                getWorld().addObject(new Menang(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(50, 180);
                
            }
            
            //getWorld().removeObject(this);
        }
        
        else if(isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            
            MyWorld.life1.setValue(0);
            if (MyWorld.life1.getValue()==0){
                getWorld().addObject(new Menang(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(50, 180);
            }
        }
        
        else if(isTouching(Child.class)){
            //removeTouching(Enemy.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            
            MyWorld.life1.setValue(0);

            if (MyWorld.life1.getValue()==0){
                getWorld().addObject(new Menang(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(50, 180);
            }
        }
        
        else if(isTouching(Enemy2.class)){
            //removeTouching(Enemy.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            
            MyWorld.life1.setValue(0);

            if (MyWorld.life1.getValue()==0){
                getWorld().addObject(new Kalah(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(50, 180);
            }
        }
        
        else if(isTouching(Hero.class)){
            removeTouching(Hero.class);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            
            MyWorld.life1.add(-1);
            if (MyWorld.life1.getValue()==0){
                getWorld().addObject(new Kalah(), 300,300);
                getWorld().removeObject(this);
                Greenfoot.stop();
            }
            else{
                setLocation(50, 180);
            }
        }
    }
}