import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Child here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Child extends Actor
{
    /**
     * Act - do whatever the Child wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int life1;
    public Child()
    {
      getImage().scale(60,50);
      setRotation(0);
      life1 = 3;
    }
    
    int speed = 2;
    int rotation = 360;
    public Child(int speed, int rotation){
       this.speed = speed;
       this.rotation = rotation;
    }
    
    //int musuhMove = 0;
    //int musuhMove1 = 0;
    public void act() 
    {
        // Add your action code here.
        //move(this.speed);
        //musuhMoveChild();
        showStatus1();
        hitPeluru2();
    }
    
    int musuhMove = 0;
    public void musuhMoveChild(){
      
    
      musuhMove++;
      if (musuhMove == 1){
      if (isAtEdge()){
           turn(Greenfoot.getRandomNumber(this.rotation));
           musuhMove = 0;
        }
        else{
           move (this.speed);
           musuhMove = 0;
           
        }
        //musuhMove1 = 0;
    }
    }
    
    public void hitPeluru2(){
        if (isTouching(Peluru.class)){
        
        nyawa1();
        showStatus1();
        if (life1 == 0){
            MyWorld.score.add(5);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            removeTouching(Peluru.class);
            Enemy musuh = new Enemy();
            getWorld().addObject(musuh,300, 300);
            getWorld().removeObject(this);
            
        }
        }
        else if (isTouching(Peluru2.class)){
        nyawa1();
        showStatus1();
        if (life1 == 0){
            MyWorld.score1.add(5);
            //getWorld().addObject(new Ledakan(), getX(), getY());
            removeTouching(Peluru2.class);
            Enemy musuh = new Enemy();
            getWorld().addObject(musuh,300, 300);
            getWorld().removeObject(this);
            
        }   
        }
        /*else if ((isTouching(Hero.class))||(isTouching(Hero1.class))){ 
            //nyawa1();
            life1 = 0;
            showStatus1();
            Enemy musuh = new Enemy();
            getWorld().addObject(musuh,300, 300);
            getWorld().removeObject(this);
        }*/
    }
    
    //int life = 3;
    public void nyawa1(){
        if(life1 > 0){
            life1--;
            removeTouching(Peluru.class);
            removeTouching(Peluru2.class);
        }
        
    }
    
    public void showStatus1(){
        getWorld().showText("Agent life: " + life1, 300, 20);
    }
    
}
