/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhthu.bt4;

import java.time.LocalDate;

/**
 *
 * @author admin
 */
public class TkKyHan extends TaiKhoan{
    private KyHan kyHan;
    private LocalDate ngayDaoHan;

    public TkKyHan(String tenTK, double soTien, KyHan kyHan) {
        super(tenTK, soTien);
        this.kyHan = kyHan;
        
        this.ngayDaoHan = kyHan.tinhDaoHan(LocalDate.now());
//        this.ngayDaoHan = LocalDate.now();
//        switch (kyHan) {
//            case MOT_TUAN -> this.ngayDaoHan = this.ngayDaoHan.plusDays(7);
//            case MOT_THANG -> this.ngayDaoHan = this.ngayDaoHan.plusMonths(1);
//            case MOT_NAM -> this.ngayDaoHan = this.ngayDaoHan.plusYears(1);
//        }
       }

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan.equals(LocalDate.now());
    }
    
    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Ky han: %sNgay dao han: %s\n", this.kyHan, this.ngayDaoHan.format(CauHinh.FORMATTER));
    }


    /**
     * @return the kyHan
     */
    public KyHan getKyHan() {
        return kyHan;
    }

    /**
     * @param kyHan the kyHan to set
     */
    public void setKyHan(KyHan kyHan) {
        this.kyHan = kyHan;
    }

    /**
     * @return the ngayDaoHan
     */
    public LocalDate getNgayDaoHan() {
        return ngayDaoHan;
    }

    /**
     * @param ngayDaoHan the ngayDaoHan to set
     */
    public void setNgayDaoHan(LocalDate ngayDaoHan) {
        this.ngayDaoHan = ngayDaoHan;
    }

    @Override
    public double tinhLai() {
        return this.kyHan.tinhLai(this.soTien);
        
    }
}