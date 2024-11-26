/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhthu.th3;

/**
 *
 * @author admin
 */
public class TamGiacDeu extends TamGiacCan {
    public TamGiacDeu (double a) throws Exception{
        super(a, a);
}
    @Override
    public String toString(){
        return String.format("Tam Giac Deu\nChu vi: %.1f\nDien tich: %.1f\n", this.tinhChuVi(), this.tinhDienTich());
    }
}
