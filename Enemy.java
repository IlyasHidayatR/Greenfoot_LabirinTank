import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int  life;
    public Enemy(){
      getImage().scale(40,40);
      setRotation(180);
      life = 10;
    }
    
    int speed = 2;
    int rotation = 360;
    public Enemy(int speed, int rotation){ //polymorphism
        this.speed = speed;
        this.rotation = rotation;
    }
    
    
    public void act() 
    {
        // Add your action code here.
        showStatus();
        //move (this.speed);       
        //musuhMove();
        fireLaser();
        hitPeluru();
    }
    
    int musuhMove = 0;
    public void musuhMove(){
      
     musuhMove++;
      if (musuhMove == 1){
      if ((isAtEdge())){
           turn(Greenfoot.getRandomNumber(this.rotation));
           musuhMove = 0;
        }
        else{
           move (this.speed);
           musuhMove = 0;
           
        }
    }
    }
    
    int laserCounter = 0;
    private void fireLaser(){
        EnemyPeluru laser = new EnemyPeluru();
            
        //if (Greenfoot.isKeyDown("Enter")){
        laserCounter++;
        if (laserCounter==30){
            //Greenfoot.playSound("Boom.mp3");
            //lokasiPeluru();
            laser.setRotation(getRotation());
            getWorld().addObject(laser, getX(), getY());
            laserCounter=0;
        }
    //}
  }
    
    public void hitPeluru(){
        if (isTouching(Peluru.class)){
        
        nyawa();
        showStatus();
        if (life == 0){
            MyWorld.score.add(10);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            removeTouching(Peluru.class);
            getWorld().removeObject(this);
        }
            
        }
        else if (isTouching(Peluru2.class)){
        
        nyawa();
        showStatus();
        if (life == 0){
            MyWorld.score1.add(10);
            
            //getWorld().addObject(new Ledakan(), getX(), getY());
            removeTouching(Peluru2.class);
            getWorld().removeObject(this);
            
        }
        }
        /*else if ((isTouching(Hero.class))||(isTouching(Hero1.class))){ 
            nyawa();
            
            life = 0;
            showStatus();
            getWorld().removeObject(this);
        }*/
        
    }
    
    
    //int life = 10;
    public void nyawa(){
        if(life > 0){
            life--;
            removeTouching(Peluru.class);
            removeTouching(Peluru2.class);
        }
    }
    
    public void showStatus(){
        getWorld().showText("Bos Life: " + life, 300, 20);
    }
}
