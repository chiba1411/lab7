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
public class main {
    public static void main(String[] args) {
        Moveable m=new Movepoint(5,5,5,5);
        
        
        m.moveup();
        
        m.movedown();
        
        m.moveleft();
        
        m.moveright();
        
        m.toString();
    }
}
