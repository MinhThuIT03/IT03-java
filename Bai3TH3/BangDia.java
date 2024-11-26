/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3TH3;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham {
    private double doDai;

    public BangDia(String ten, double gia, double doDai) {
        super(ten, gia);
        this.doDai = doDai;
    }
    public BangDia(){
        
    }
    /**
     * @return the doDai
     */
    public double getDoDai() {
        return doDai;
    }

    /**
     * @param doDai the doDai to set
     */
    public void setDoDai(double doDai) {
        this.doDai = doDai;
    }

    @Override
    public String toString() {
        return String.format("%sDo dai: %.1f phuts\n", super.toString(), this.doDai);
    }
    @Override
    public void nhapSP() {
        super.nhapSP();
        System.out.println("Do dai = ");
        this.doDai= Integer.parseInt(CauHinh.sc.nextLine());
    }
}
