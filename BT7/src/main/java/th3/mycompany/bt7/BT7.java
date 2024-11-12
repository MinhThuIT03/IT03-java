/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package th3.mycompany.bt7;

import java.io.FileNotFoundException;
import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class BT7 {

    public static void main(String[] args) throws FileNotFoundException {
       HocVien h1 = new HocVien("Nguyen Thi", "10/09/2005");
        HocVien h2 = new HocVien("Duong Thi", "12/09/2005");
        HocVien h3 = new HocVien("Dao Thi", "10/06/2005");
        HocVien h4 = new HocVien("Thai Thi", "15/04/2005");
        
        QuanLyHocVien q1 = new QuanLyHocVien();
//        q1.themHV(h1, h2, h3, h4);
//        q1.hienThi();
        
        q1.themHV("src/main/resources/hocvien.txt");
        q1.hienThi();
        
        System.out.println(" ");
        q1.nhapDiemDs();
        System.out.println(" ");
        q1.hienThi();
        
        System.out.println(" Nhung hoc vien co hoc bong: ");
        q1.timKiem().forEach(h -> h.hienThi());
    }
}
