/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TH4Bai1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class QLHinh {
    private List<Hinh> ds = new ArrayList<>();
    
    public void themHinh (Hinh... a){
        this.ds.addAll(Arrays.asList(a));
    }
    public void hienThi() {
        this.ds.forEach(h -> System.out.println(h));
    }        
    public void xoaHinh(String ten){
        this.ds.removeIf(h -> h.getTen().equalsIgnoreCase(ten));
    }

    public List<Hinh> layDanhSach(Class<?> layHinh){
        List<Hinh> kq = new ArrayList<>();
        return this.ds.forEach(h -> h.getClass() == loaiHinh -> kq.add(h));
    }
    
    /**
     * @return the ds
     */
    public List<Hinh> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<Hinh> ds) {
        this.ds = ds;
    }
    
}
