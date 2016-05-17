package starfighteraped6;

import java.awt.Color;
import java.awt.Graphics;

public abstract class MovingThing implements Moveable
{
    private int xPos;
    private int yPos;
    private int width;
    private int height;
    private Color color;
    public MovingThing(){
        xPos = 10;
        yPos = 10;
        width = 10;
        height = 10;
        color = new Color(255,0,0);
    }
    public MovingThing(int x, int y){
        xPos = x;
        yPos = y;
        width = 10;
        height = 10;
        color = new Color(255,0,0);
    }
    public MovingThing(int x, int y,Color c){
        xPos = x;
        yPos = y;
        width = 10;
        height = 10;
        color = c;
    }
    public MovingThing(int x,int y,int w,int h){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = new Color(255,0,0);
    }
    public MovingThing(int x,int y,int w,int h,Color c){
        xPos = x;
        yPos = y;
        width = w;
        height = h;
        color = c;
    }
    public abstract void move(String direction);
    public abstract void draw(Graphics window);
    @Override
    public void setPos(int x,int y){
        xPos = x;
        yPos = y;
    }
    @Override
    public void setX(int x){
        xPos = x;
    }
    @Override
    public void setY(int y){
        yPos = y;
    }
    @Override
    public void setWidth(int w){
        width = 10;
    }
    @Override
    public void setHeight(int h){
        height = h;
    }
    @Override
    public void setColor(Color c){
        color = c;
    }
    @Override
    public int getX(){
        return xPos;   //finish this method
    }
    @Override
    public int getY(){
        return yPos;  //finish this method
    }
    @Override
    public int getWidth(){
        return width;  //finish this method
    }
    @Override
    public int getHeight(){
        return height;  //finish this method
    }
    @Override
    public Color getColor(){
        return color;
    }
    @Override
    public String toString(){
        return getX()+" "+getY()+" "+getWidth()+" "+getHeight();
    }
}