package starfighterreal;

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Shape;
import javax.imageio.ImageIO;
import static java.lang.System.*;

public class Ship extends MovingThing
{
    private int speed;
    private Image image;

    public Ship(){
        this(10,10,10,10,10);
    }
    public Ship(int x, int y){
       this(x,y,10,10,10);
    }
    public Ship(int x, int y, int s){
       this(x,y,10,10,s);
    }
    public Ship(int x, int y, int w, int h, int s){
        super(x, y, w, h);
        speed=s;
        try{
            //desktop
//            File url = new File("H:\\CompSci\\Programs\\StarfighterAPED6\\"
//                    + "src\\StarFighterReal\\ship.jpg");
            //laptop
            File url = new File("C:\\Users\\Administrator\\Desktop\\"
                    + "School\\CompSci\\Repo\\src\\StarFighterReal\\ship.png");
            image = ImageIO.read(url);
        }
        catch(Exception e){
            err.println(e + " ship constructor");
        }
    }
    @Override
    public void setSpeed(int s){
       speed = s;
    }
    @Override
    public int getSpeed(){
       return speed;
    }
    public Shape getShape(){
        return new Rectangle(getX(),getY(),getWidth(),getHeight());
    }
    /**
     *
     * @param direction
     */
    @Override
    public void move(String direction){
        if(direction.equals("LEFT")){
            if(getX()-getSpeed()>=0){ //screen left param = 0
                setX(getX()-getSpeed());
            }
        }
        if(direction.equals("RIGHT")){
            if(getX()+getWidth()+getSpeed()<=1280){ //screen right param = 1280
                setX(getX()+getSpeed());
            }
        }
        if(direction.equals("UP")){
            if(getY()-getSpeed()>=0){ //screen upper param = 1280
                setY(getY()-getSpeed());
            }
        }
        if(direction.equals("DOWN")){
            if(getY()+getHeight()+getSpeed()<=985){ //screen lower param = 985
                setY(getY()+getSpeed());
            }
        }
    }
    @Override
    public void draw(Graphics window){
        window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
    }
    @Override
    public String toString(){
        return super.toString() + " " + getSpeed();
    }
}