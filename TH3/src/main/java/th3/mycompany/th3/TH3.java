/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package th3.mycompany.th3;

/**
 *
 * @author admin
 */
public class TH3 {

    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(-1 ,-2);
        PhanSo p2 = new PhanSo(2 ,5);
        PhanSo p3 = new PhanSo(3 ,5);
        
        DsPhanSo  q1 = new DsPhanSo();
        q1.themPhanSo(p1);
        q1.themPhanSo(p2, p3);
        q1.themPhanSo();
        System.out.println("a==============");
        q1.hienThi();
        
        System.out.println(" ");
        System.out.println("Xoa phan so -1/2");
        q1.xoaPhanSo(-1, -2);
        q1.hienThi();
        
        System.out.println(" ");
        System.out.println("Sap xep tang dan");
        q1.sapXep();
        q1.hienThi();
        
        System.out.println(" ");
        System.out.println("Tim Max");
        q1.timMax();
        q1.hienThi();
    }
}
