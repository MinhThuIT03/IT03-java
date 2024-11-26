/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhthu.th3;

/**
 *
 * @author admin
 */
public class Ellipse {
    private double bkTrucLon;
    private double bkTrucNho;
    
    public Ellipse(double bkTrucLon, double bkTrucNho){
        this.bkTrucLon = bkTrucLon;
        this.bkTrucNho = bkTrucNho;
    }

    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
    }

    /**
     * @return the bkTrucNho
     */
    public double getBkTrucNho() {
        return bkTrucNho;
    }

    /**
     * @param bkTrucNho the bkTrucNho to set
     */
    public void setBkTrucNho(double bkTrucNho) {
        this.bkTrucNho = bkTrucNho;
    }
    
    public double tinhDienTich(){
        return this.bkTrucNho * this.bkTrucLon * Math.PI;
        
    }
    @Override
    public String toString(){
        return String.format("Hinh Ellipse\nDien tich: %.1f\n", this.tinhDienTich());
    }
}
