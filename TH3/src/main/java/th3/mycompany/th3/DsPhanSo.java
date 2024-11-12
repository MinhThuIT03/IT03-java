/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th3.mycompany.th3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 *
 * @author admin
 */
public class DsPhanSo {
    private List<PhanSo> ds = new ArrayList<>();
    
    public void themPhanSo (PhanSo p){
        this.ds.add(p);
    }
    public void themPhanSo (PhanSo... a){
        this.ds.addAll(Arrays.asList(a));
        
    }
    public void hienThi(){
        this.getDs().forEach(x -> x.hienThi());
    }
    public void themPhanSo(){
        PhanSo p = new PhanSo();
        p.nhap1Ps();
        
        this.ds.add(p);
    }
    
    public void xoaPhanSo(PhanSo p){
        this.ds.removeIf(q -> q.soSanh(p) ==0);
    }
    public void xoaPhanSo(int tu, int mau){
        PhanSo p = new PhanSo(tu, mau);
        this.xoaPhanSo(p);
    }
    
    public PhanSo tong(){
        return this.ds.stream().reduce(new PhanSo(), (t,x) -> t.cong(x));
    }
    
    public PhanSo timMax(){
        return this.ds.stream().max((p1,p2) -> p1.soSanh(p2)).get();
    }
    
    public void sapXep(){
        this.ds.sort((p1, p2)-> p1.soSanh(p2));
    }
    /**
     * @return the ds
     */
    public List<PhanSo> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<PhanSo> ds) {
        this.ds = ds;
    }
}
