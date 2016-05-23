package starfighterreal;

/*
*
*@author Ethan Dickey
*
*
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Canvas;
import java.awt.event.ActionEvent;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import static java.lang.Character.*;
import java.awt.image.BufferedImage;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import static java.lang.System.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class OuterSpace extends Canvas implements KeyListener, Runnable{
    
    private Ship ship;
    private Alien alienOne;
    private Alien alienTwo;
    private AlienHorde horde; //implement
    private Bullets shots; //fix
    private boolean[] keys;
    private BufferedImage back;
    
    public OuterSpace(){
        setBackground(Color.black);
        keys = new boolean[5];
        ship = new Ship(640,773,20,20,2);
        alienOne = new Alien(20,20,3);
        alienTwo = new Alien(70,20,3);
        horde = new AlienHorde(5);
        shots = new Bullets();
        this.addKeyListener(this);
        new Thread(this).start();
        setVisible(true);
    }
    public void update(Graphics window){
        paint(window);
    }
    public void paint(Graphics window){
        //set up the double buffering to make the game animation nice and smooth
        Graphics2D twoDGraph = (Graphics2D)window;

        //take a snap shop of the current screen and same it as an image
        //that is the exact same width and height as the current screen
        if(back==null)
           back = (BufferedImage)(createImage(getWidth(),getHeight()));

        //create a graphics reference to the back ground image
        //we will draw all changes on the background image
        Graphics graphToBack = back.createGraphics();
        
        graphToBack.setColor(Color.BLUE);
        graphToBack.drawString("StarFighter ", 25, 50 );
        graphToBack.setColor(Color.BLUE);
        graphToBack.fillRect(0,0,1280,985);
        //draw singles
        ship.draw(graphToBack);
        alienOne.draw(graphToBack);
        alienTwo.draw(graphToBack);
        //horde dealings
        if(horde.isEmpty())
            horde.refresh();
        horde.moveEmAll();
        horde.removeDeadOnes();
        horde.drawEmAll(graphToBack);
        //shots dealings
        shots.moveEmAll();
        shots.cleanEmUp(); //don't need
        shots.drawEmAll(graphToBack);
        if(keys[0] == true){
            ship.move("LEFT");
        }
        if(keys[1] == true){
            ship.move("RIGHT");
        }
        if(keys[2] == true){
            ship.move("UP");
        }
        if(keys[3] == true){
            ship.move("DOWN");
        }
        if(keys[4] == true){
            shots.add(new Ammo(ship.getX()+(ship.getWidth()/2)-4,ship.getY()-10,2));
        }
        //collision detection
        List<Ammo> ammo = shots.getList();
        List<Alien> aliens = horde.getList();
        for(int ab=0;ab<aliens.size();ab++){
            if(aliens.get(ab).getY()>985)
            {
//                aliens.get(ab).setSpeed(0);
                horde.remove(ab);
                ab--;
            }
            else{
                for(int jz=0;jz<ammo.size();jz++){
                    if(aliens.get(ab).getShape().intersects((Rectangle2D)(ammo.get(jz).getShape()))){
//                        aliens.get(ab).setSpeed(0);
                        horde.remove(ab);
                        shots.remove(jz);
//                        ammo.get(jz).setSpeed(0);
                        jz=ammo.size();
                        ab--;
                    }
                }
            }
        }
        
        //add code to move Ship, Alien, etc.
        //add in collision detection to see if Bullets hit the Aliens and if Bullets hit the Ship
        
        twoDGraph.drawImage(back, null, 0, 0);
    }
    public void keyPressed(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
                keys[0] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                keys[1] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
                keys[2] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
                keys[3] = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
                keys[4] = true;
        }
        repaint();
    }
    public void keyReleased(KeyEvent e){
        if (e.getKeyCode() == KeyEvent.VK_LEFT){
                keys[0] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                keys[1] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP){
                keys[2] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN){
                keys[3] = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_SPACE){
                keys[4] = false;
        }
        repaint();
    }
    public void keyTyped(KeyEvent e){}
    public void run(){
        try{
            while(true)
            {
                Thread.currentThread().sleep(5);
                repaint();
            }
        }catch(Exception e){
            err.println(e + "run()");
        }
    }
//    private boolean collide() {
////        if(){
////            
////        }
//        return false;
//    }
}