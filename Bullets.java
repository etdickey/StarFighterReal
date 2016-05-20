package starfighterreal;

/*
*
*@author Ethan Dickey
*
*
*/

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import javax.imageio.ImageIO;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
    private List<Ammo> ammo;

    public Bullets(){
        
    }
    public void add(Ammo al){
        ammo.add(al);
    }
    //post - draw each Ammo
    public void drawEmAll(Graphics window){
        ammo.stream().forEach((ab) -> {
            ab.draw(window);
        });
    }
    public void moveEmAll(){
        ammo.stream().forEach((ab) -> {
            ab.move("UP");//doesn't use the string
        });
    }
    public void cleanEmUp(){ //remove all of the "dead" bullets (with 0 speed)
        for(int ab=0;ab<ammo.size();ab++){
            if(ammo.get(ab).getSpeed()==0){
                ammo.remove(ab);
                ab--;
            }
        }
    }
    public List<Ammo> getList(){
        return ammo;
    }
    public String toString(){
        String str = "";
        for(Ammo ab : ammo){
            str+=ab.toString()+" ";
        }
        return str;
    }
}