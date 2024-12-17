/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.minhthu.bt4;

/**
 *
 * @author admin
 */
public class BT4 {

    public static void main(String[] args) {
        TaiKhoan t1 = new TkKhongKyHan("NVA", 1000);
        TaiKhoan t2 = new TkKyHan("HTB", 2000, KyHan.MOT_TUAN);
        TaiKhoan t3 = new TkKyHan("LTC", 3000, KyHan.MOT_THANG);
        TaiKhoan t4 = new TkKyHan("TVD", 4000, KyHan.MOT_NAM);
        
        t1.nopTien(1000);
        t2.nopTien(1000);
        QuanLyTaiKhoan q1 = new QuanLyTaiKhoan();
        q1.themTk(t1, t2, t3, t4);
        q1.hienThi();
        
        q1.getDs().forEach(s -> System.out.println(s.tinhLai()));
    }
}
