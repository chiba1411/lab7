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
public class MayBay extends Phuongtiendichuyen {

    private String loainhienlieu;

    public MayBay() {
    }

    public MayBay(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public MayBay(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat) {
        super(loaiphuongtien, hangsanxuat);
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }
    
    public void catCanh() {
        System.out.println("may bay cat canh");
    }

    public void haCanh() {
        System.out.println("may bay ha canh");
    }
    @Override
    public double layVantoc() {
        return 320;
    }


}
