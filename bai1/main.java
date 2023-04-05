/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author Admin
 */
public class main {

    public static void main(String[] args) {
        MayBay mb = new MayBay();
        mb.setLoainhienlieu("dau");
        System.out.println("nhien lieu:" + mb.getLoainhienlieu());
        mb.catCanh();
        mb.haCanh();
        Phuongtiendichuyen p1 = new MayBay();
        System.out.println("vt may bay:" + p1.layVantoc());

        XeOto ot = new XeOto();
        ot.setLoainhienlieu("dau");
        System.out.println("nhien lieu:" + ot.getLoainhienlieu());
        Phuongtiendichuyen p2 = new XeOto();
        System.out.println("vt oto:" + p2.layVantoc());

        Phuongtiendichuyen p3 = new Xedap();
        System.out.println("vt xe may:" + p3.layVantoc());

    }
}
