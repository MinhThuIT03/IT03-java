/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th.mycompany.th;

/**
 *
 * @author admin
 */
public class HinhTron {
    private Diem tam;
    private double banKinh;

    
    public HinhTron (Diem tam, double banKinh){
        this.tam =tam;
        this.banKinh=banKinh;
    }

    /**
     * @return the tam
     */
    public Diem getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(Diem tam) {
        this.tam = tam;
    }

    /**
     * @return the banKinh
     */
    public double getBanKinh() {
        return banKinh;
    }

    /**
     * @param banKinh the banKinh to set
     */
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    public int ktViTriDiemVaDuongTron(Diem d){
        double kc= this.tam.tinhKhoangCach(d);
        if (kc > this.banKinh)
            return 1;
        else if (kc < this.banKinh)
            return -1;
        return 0;
    }
    public int ktViTriDtVaDt(HinhTron dt){
        double kc = this.tam.tinhKhoangCach(dt.tam);
        double t = this.banKinh + dt.banKinh;
        
        if (kc >t)
            return 1;
        else if (kc < t)
            return -1;
        return 0;
    }
    public double tinhDtHinhTron(){
        return Math.PI * Math.pow(this.banKinh, 2);
    }
}
