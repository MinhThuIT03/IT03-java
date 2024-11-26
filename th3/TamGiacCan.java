/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhthu.th3;

/**
 *
 * @author admin
 */
public class TamGiacCan extends TamGiac {
    public TamGiacCan (double a, double c) throws Exception{
        super(a, a, c);
}
    @Override
    public String toString(){
        return String.format("Tam Giac Can\nChu vi: %.1f\nDien tich: %.1f\n", this.tinhChuVi(), this.tinhDienTich());
    }
}
