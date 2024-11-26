/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3TH3;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;
import java.util.stream.Collectors;
/**
 *
 * @author admin
 */
public class QLSanPham {
    private List<SanPham> ds = new ArrayList<>(); 
    
    public void themSP(SanPham... a){
        this.getDs().addAll(Arrays.asList(a));
    }
    public void themSP(String tenLop) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
        Class c = Class.forName(tenLop);
        SanPham s = (SanPham) c.getDeclaredConstructor().newInstance();
       
        s.nhapSP();
        this.ds.add(s);
    }
    public void hienThi(){
        this.ds.forEach(s -> System.out.println(s));
    }
    public SanPham timKiem(int id){
        return this.ds.stream().filter(s -> s.getId() == id).findFirst().get();
    }
    public List<SanPham> timKiem(String str) {
        try {
             Class c = Class.forName(str);
             return this.ds.stream().filter(s -> c.isInstance(s))
                .collect(Collectors.toList());
        } catch (ClassNotFoundException ex) {
            return this.ds.stream().filter(s -> s.getTen()
                .contains(str)).collect(Collectors.toList());
        }
    }
    public List<SanPham>timKiem(double min, double max){
        return this.ds.stream().filter(s -> s.getGia() >= 
                min && s.getGia() <= max).collect(Collectors.toList());
    }
     public void sapXep(){
         this.ds.sort((s1, s2) -> Double.compare(s1.getGia(), s2.getGia()));
     }
     public void sapXep2(){
         this.ds.sort((s1, s2 -> {
             String t1 = s1.getClass().toString();
             String t2 = s2.getClass().toString();
             if (t1.equals(t2))
                 return Double.compare(s1.getGia(), s2.getGia());
             return t1.compareTo(t2)
         });
     }

    /**
     * @return the ds
     */
    public List<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<SanPham> ds) {
        this.ds = ds;
    }
    
    
}
