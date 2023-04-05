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
public class XeOto extends Phuongtiendichuyen {
    private String loainhienlieu;

    public XeOto() {
    }

    public XeOto(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
    }

    public XeOto(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat) {
        super(loaiphuongtien, hangsanxuat);
        this.loainhienlieu = loainhienlieu;
    }

    public XeOto(String loainhienlieu, String loaiphuongtien, Hangsanxuat hangsanxuat, String tenHangsanxuat, String tenQuocgia) {
        super(loaiphuongtien, hangsanxuat, tenHangsanxuat, tenQuocgia);
        this.loainhienlieu = loainhienlieu;
    }

    public String getLoainhienlieu() {
        return loainhienlieu;
    }

    public void setLoainhienlieu(String loainhienlieu) {
        this.loainhienlieu = loainhienlieu;
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
        return 80;
    }
    
}
