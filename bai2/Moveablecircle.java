/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author Admin
 */
public class Moveablecircle implements Moveable{
    int radius;
    Movepoint a;

    public Moveablecircle(int radius, Movepoint a) {
        this.radius = radius;
        this.a = a;
    }        

    @Override
    public void moveup() {
        a.y=a.y-a.yseed;
    }

    @Override
    public void movedown() {
       a.y=a.y+a.yseed;
    }

    @Override
    public void moveleft() {
       a.x=a.x-a.xseed; 
    }

    @Override
    public void moveright() {
        a.x=a.x-a.xseed;
    }

    @Override
    public String toString() {
        return "" + a.toString()+","+radius +"";
    }
    
    
}
