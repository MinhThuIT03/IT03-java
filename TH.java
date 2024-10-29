/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package th.mycompany.th;

/**
 *
 * @author admin
 */
public class TH {

    public static void main(String[] args) throws Exception {
        // Diem d1= new Diem (5,15);
        // Diem d2= new Diem (9,8);
        HinhTron d1 = new HinhTron (new Diem(5, 6), 15);
        HinhTron d2 = new HinhTron (new Diem( 4, 6), 20);
        System.out.println(d1.ktViTriDtVaDt(d2));
        System.out.println(d1.tinhDtHinhTron());
//        d1.hienThi();
//        double kc=d1.tinhKhoangCach(d2);
//        System.out.printf("Khoang cach = %.1f\n", kc);
//        
        
        
//        DoanThang dt1=new DoanThang (new Diem (1,0), new Diem(0,1));
//        DoanThang dt2=new DoanThang (new Diem (2,0), new Diem(0,2));
//        System.out.println(dt1.isSongSong(dt2));

        HinhChuNhat h = new HinhChuNhat(d1, d2);
        System.out.println(h.tinhDienTich());
        System.out.println(h.tinhChuVi());

    }
}
