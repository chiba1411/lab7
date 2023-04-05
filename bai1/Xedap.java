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
public class Xedap extends Phuongtiendichuyen{

    public Xedap() {
    }

    public String getLoaiphuongtien() {
        return loaiphuongtien;
    }

    public void setLoaiphuongtien(String loaiphuongtien) {
        this.loaiphuongtien = loaiphuongtien;
    }

    public Hangsanxuat getHangsanxuat() {
        return hangsanxuat;
    }

    public void setHangsanxuat(Hangsanxuat hangsanxuat) {
        this.hangsanxuat = hangsanxuat;
    }
    
    

    @Override
    double layVantoc() {
        return 15;
    }
    
}
