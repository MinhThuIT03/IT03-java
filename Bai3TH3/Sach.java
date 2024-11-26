/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3TH3;

/**
 *
 * @author admin
 */
public class Sach extends SanPham{
    private int soTrang;
    public Sach(){
        
    }

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    public Sach(String ten, double gia, int soTrang) {
        super(ten, gia);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return String.format("%sSo trang: %d\n", super.toString(), this.soTrang);
    }

    @Override
    public void nhapSP() {
        super.nhapSP();
        System.out.println("So trang = ");
        this.soTrang = Integer.parseInt(CauHinh.sc.nextLine());
    }
    
    
    
}
