/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4Bai1;

import com.minhthu.bt4.KyHan;
import com.minhthu.bt4.QuanLyTaiKhoan;
import com.minhthu.bt4.TaiKhoan;
import com.minhthu.bt4.TkKhongKyHan;
import com.minhthu.bt4.TkKyHan;

/**
 *
 * @author admin
 */
public class Demo {
     public static void main(String[] args) {
        Hinh t1 = new HinhChuNhat("Hinh chu nhat", 5, 4);
        Hinh t2 = new HinhVuong("Hinh vuong", 5);
        Hinh t3 = new TamGiacCan("Hinh tam giac can", 6, 7);
        
        QLHinh q1 = new QLHinh();
        q1.themHinh(t1, t2, t3);
        q1.hienThi();
       
     }
}
