/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th3.mycompany.bt7;

import java.time.LocalDate;
import java.util.stream.DoubleStream;

/**
 *
 * @author admin
 */
public class HocVien {
    private static int dem;
    private int maHV = ++dem;
    private String tenHV;
    private LocalDate ngaySinh;
    private double[] diem;

    public HocVien(String tenHV, LocalDate ngaySinh) {
        this.tenHV = tenHV;
        this.ngaySinh = ngaySinh;
    }

    public HocVien(String tenHV, String ngaySinh) {
//       this(tenHV, LocalDate.parse(ngaySinh, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
         this(tenHV, LocalDate.parse(ngaySinh, CauHinh.FORMETTER));
         
        

    }
    
    public void hienThi(){
        System.out.printf("%d - %s - %s\n", this.maHV, this.tenHV,
//                this.ngaySinh.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
               this.ngaySinh.format(CauHinh.FORMETTER));
        if (this.diem != null){
            for (var x: this.diem)
                System.out.printf("%.1f\t", x);
            System.out.println();
        }
    }
    public void nhapDiem1Hv(){
        System.out.printf("==Nhap cho %s\n", this.tenHV.toUpperCase());
        this.diem = new double[CauHinh.SO_MON];
        for( int i=0; i<CauHinh.SO_MON; i++){
            System.out.printf("Mon thu %d = ", i+1);
            this.diem[i] = Double.parseDouble(CauHinh.sc.nextLine());
        }
            
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
    public double tinhTb(){
        if (this.diem !=null)
            return DoubleStream.of(this.diem).average().getAsDouble();
        return 0;
    }
    public boolean isHocBong(){
        for (var x: this.diem)
            if (x<5)
                return false;
        return this.tinhTb() >= 0;
    }

    /**
     * @return the maHV
     */
    public int getMaHV() {
        return maHV;
    }

    /**
     * @param maHV the maHV to set
     */
    public void setMaHV(int maHV) {
        this.maHV = maHV;
    }

    /**
     * @return the tenHV
     */
    public String getTenHV() {
        return tenHV;
    }

    /**
     * @param tenHV the tenHV to set
     */
    public void setTenHV(String tenHV) {
        this.tenHV = tenHV;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }
}    
