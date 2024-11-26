/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3TH3;

/**
 *
 * @author admin
 */
public abstract class SanPham {
    private static int dem;
    private int id = ++ dem;
    private String ten;
    private double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }
   public SanPham(){
       
   }
    public void nhapSP(){
        System.out.println("Ten = ");
        this.ten = CauHinh.sc.nextLine();
        System.out.println("Gia = ");
        this.gia = Double.parseDouble(CauHinh.sc.nextLine());
    }

    @Override
    public String toString() {
        return String.format("%d - %s - %.1f VND\n", this.getId(), this.getTen(), this.getGia());
    }

    /**
     * @return the dem
     */
    public static int getDem() {
        return dem;
    }

    /**
     * @param aDem the dem to set
     */
    public static void setDem(int aDem) {
        dem = aDem;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }
    
}
