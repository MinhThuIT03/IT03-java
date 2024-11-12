/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th3.mycompany.bt7;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLyHocVien {

    private List<HocVien> ds = new ArrayList<>();

    public void themHV(HocVien... a) {
        this.getDs().addAll(Arrays.asList(a));
    }

    public void themHV(String duongDan) throws FileNotFoundException {
        File f = new File(duongDan);
        try ( Scanner sc = new Scanner(f)) {
            while (sc.hasNext()) {
                this.ds.add(new HocVien(sc.nextLine(), sc.nextLine()));
            }
        }
    }

    public void nhapDiemDs() {
        this.ds.forEach(h -> h.nhapDiem1Hv());
    }

    public void hienThi() {
        this.getDs().forEach(h -> h.hienThi());
    }
    public HocVien timKiem(int id){
        return this.ds.stream().filter(h -> h.getMaHV() == id).findFirst().get();
    }
    public List<HocVien> timKiem (String kw){
        return this.ds.stream().filter(h -> h.getTenHV().contains(kw)).collect(Collectors.toList());
        
    }
    public List<HocVien> timKiem (){
         return this.ds.stream().filter(h -> h.isHocBong()).collect(Collectors.toList());
    
    }
    /**
     * @return the ds
     */
    public List<HocVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<HocVien> ds) {
        this.ds = ds;
    }
}
