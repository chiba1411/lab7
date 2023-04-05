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
public class Hangsanxuat {
    private  String tenHangsanxuat;
    private String tenQuocgia;

    public Hangsanxuat() {
    }

    public Hangsanxuat(String tenHangsanxuat, String tenQuocgia) {
        this.tenHangsanxuat = tenHangsanxuat;
        this.tenQuocgia = tenQuocgia;
    }

    public String getTenHangsanxuat() {
        return tenHangsanxuat;
    }

    public void setTenHangsanxuat(String tenHangsanxuat) {
        this.tenHangsanxuat = tenHangsanxuat;
    }

    public String getTenQuocgia() {
        return tenQuocgia;
    }

    public void setTenQuocgia(String tenQuocgia) {
        this.tenQuocgia = tenQuocgia;
    }
    
    
    
}
