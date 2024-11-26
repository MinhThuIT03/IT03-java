/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3TH3;

import java.lang.reflect.InvocationTargetException;

/**
 *
 * @author admin
 */
public class Tester {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SanPham s1 = new Sach("Trang Quynh", 30, 78);
        SanPham s2 = new Sach("Trang Ti", 25, 85);
        SanPham s3 = new BangDia("Tom&Jerry", 95, 45);
        
        QLSanPham q1 = new QLSanPham();
        q1.themSP(s1, s2, s3);
        q1.themSP("Bai3TH3.Sach");
        q1.themSP("Bai3TH3.BangDia");
//        q1.themSP();
//        q1.hienThi();
        
        System.out.println("=====");
        q1.timKiem("Trang").forEach(s -> System.out.println(s));
        
        System.out.println("=====");
        q1.timKiem("Bai3TH3.Sach").forEach(s -> System.out.println(s));
        
        System.out.println("=====");
        q1.sapXep();
        q1.hienThi();
    }
    
}
