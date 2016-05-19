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

    }

    //post - draw each Ammo
    public void drawEmAll(Graphics window){

    }
    public void moveEmAll(){

    }
    public void cleanEmUp(){
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
        return "";
    }
}