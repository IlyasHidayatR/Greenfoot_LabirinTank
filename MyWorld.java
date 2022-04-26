import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * @author (AryutinFoltus)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 600, 1); 

        prepare();
    }
    
    
    public static Counter score = new Counter("Score P1: ");
    public static Counter score1 = new Counter("Score P2: ");
    public static Counter life = new Counter ("Life P1: ");
    public static Counter life1 = new Counter("Life P2: ");
    public void prepare()
    {
        Line line = new Line();
        addObject(line, 49, 519);
        line.setLocation(41, 530);
        Line line2 = new Line();
        addObject(line2, 389, 357);
        line2.turnLeft();
        line2.setLocation(543, 494);
        Line line3 = new Line();
        addObject(line3, 306, 245);
        line3.setLocation(423, 442);
        Line line4 = new Line();
        addObject(line4, 152, 267);
        line4.setLocation(208, 371);
        Line line5 = new Line();
        addObject(line5, 152, 267);
        line5.setLocation(558, 357);
        Line line6 = new Line();
        addObject(line6, 217, 398);
        line6.turnLeft();
        line6.setLocation(111, 437);
        Line line7 = new Line();
        addObject(line7, 446, 440);
        line7.setLocation(442, 534);
        Line line8 = new Line();
        addObject(line8, 280, 509);
        Line line9 = new Line();
        addObject(line9, 280, 509);
        Line line10 = new Line();
        addObject(line10, 450, 568);
        Line line11 = new Line();
        addObject(line11, 507, 232);
        Line line12 = new Line();
        addObject(line12, 357, 107);
        Line line13 = new Line();
        addObject(line13, 169, 170);
        Line line14 = new Line();
        addObject(line14, 78, 370);
        Line line15 = new Line();
        addObject(line15, 195, 106);
        Line line16 = new Line();
        addObject(line16, 195, 106);
        Line line17 = new Line();
        addObject(line17, 530, 91);
        Line line18 = new Line();
        addObject(line18, 545, 319);
        line18.setLocation(510, 442);
        line9.setLocation(128, 530);
        line10.turnLeft();
        line10.setLocation(250, 497);
        line11.turnLeft();
        line11.setLocation(321, 242);
        line17.setLocation(355, 534);
        line12.setLocation(472, 357);
        line13.turnLeft(); 
        line16.turnLeft();
        line16.setLocation(176, 424);   
        line15.setLocation(387, 276);
        line13.setLocation(418, 324);
        Line line19 = new Line();
        addObject(line19, 332, 160);
        Line line20 = new Line();
        addObject(line20, 384, 203);
        Line line21 = new Line();
        addObject(line21, 174, 49);
        Line line22 = new Line();
        addObject(line22, 188, 207);
        Line line23 = new Line();
        addObject(line23, 188, 207);
        Line line24 = new Line();
        addObject(line24, 260, 365);
        Line line25 = new Line();
        addObject(line25, 221, 282);
        Line line26 = new Line();
        addObject(line26, 107, 218);
        Line line27 = new Line();
        addObject(line27, 107, 218);
        Line line28 = new Line();
        addObject(line28, 95, 145);
        Line line29 = new Line();
        addObject(line29, 151, 136);
        Line line30 = new Line();
        addObject(line30, 151, 136);
        Line line31 = new Line();
        addObject(line31, 151, 136);
        Line line32 = new Line();
        addObject(line32, 151, 136);
        Line line33 = new Line();
        addObject(line33, 151, 136);
        line24.turnLeft();
        line11.setLocation(98, 414);
        line14.setLocation(43, 448);
        line20.setLocation(557, 208);
        line19.turnLeft();
        line19.setLocation(504, 241);
        line29.turnLeft();
        line30.turnLeft();
        line27.turnLeft();
        line33.turnLeft();
        line28.turnLeft();     
        line6.turnLeft();
        line6.setLocation(43, 297);  
        line31.turnLeft();   
        line26.setLocation(42, 125);       
        line22.turnLeft();    
        line2.setLocation(541, 492);
        Line line34 = new Line();
        addObject(line34, 310, 60); 
        line30.setLocation(504, 182);
        line28.setLocation(124, 213);
        line29.setLocation(158, 249);
        line25.setLocation(189, 297);
        line32.setLocation(179, 139);
        line31.setLocation(212, 102);
        Line line35 = new Line();
        addObject(line35, 258, 216);        
        line23.setLocation(402, 195);
        line27.setLocation(356, 161); 
        line34.turnLeft();    
        Line line36 = new Line();
        addObject(line36, 335, 81);     
        line21.setLocation(405, 57);
        Line line37 = new Line();
        addObject(line37, 442, 123);
        line37.turnLeft();        
        Line line38 = new Line();
        addObject(line38, 260, 40);      
        line35.setLocation(255, 211);
        line22.setLocation(292, 176);
        line34.setLocation(292, 94);      
        line36.setLocation(323, 58); 
        line38.turnLeft();

        line33.turnLeft();
        line33.setLocation(108, 67);

        Line line39 = new Line();
        addObject(line39, 97, 35);
        line39.turnLeft();
        line39.setLocation(107, 31);
        line38.setLocation(212, 31);

        line8.setLocation(212, 530);
        line37.setLocation(440, 90);
        line24.setLocation(318, 370);
        line28.turnLeft();
        line28.setLocation(75, 214);
        removeObject(line28);
        Line line40 = new Line();
        addObject(line40, 102, 253);
        line40.turnLeft();
        line40.setLocation(75, 250);
        line26.setLocation(40, 139);
        Line line41 = new Line();
        addObject(line41,518,71);

        line41.setLocation(596,164);
        line41.setLocation(542,131);
        line41.turnLeft();

        Hero tank = new Hero();
        addObject(tank, 500, 399);

        Hero1 tank1 = new Hero1();
        addObject(tank1, 50, 180);

        Child anak = new Child();
        addObject(anak,300, 300);

        //Enemy musuh = new Enemy();
        //addObject(musuh,300, 300);

        Keluar left = new Keluar();
        addObject(left, 550, 20);

        addObject(score,50,20);
        score.setValue(0);

        addObject(life,50,50);
        life.setValue(5);

        addObject(score1,475,20);
        score1.setValue(0);

        addObject(life1,475,50);
        life1.setValue(5);

        Target orang = new Target();
        addObject(orang, 180, 100);

        Target1 target12 = new Target1();
        addObject(target12,500,480);

        Enemy2 enemy2 = new Enemy2(2, 180);
        addObject(enemy2,546,304);
        line14.setLocation(45,444);
        Enemy enemy = new Enemy();
        addObject(enemy,45,444);
        line14.setLocation(6,448);
        Enemy enemy3 = new Enemy(2, 180);
        addObject(enemy3,6,448);
    }
}