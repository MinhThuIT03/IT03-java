/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.minhthu.bt4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QuanLyTaiKhoan {
    private List<TaiKhoan> ds = new ArrayList<>();
    
    public void themTk(TaiKhoan... a) {
        this.getDs().addAll(Arrays.asList(a));
        
    }
    public void hienThi() {
        this.getDs().forEach(t -> t.hienThi());
    }

    /**
     * @return the ds
     */
    public List<TaiKhoan> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<TaiKhoan> ds) {
        this.ds = ds;
    }
}
