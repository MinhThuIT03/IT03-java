/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th.mycompany.th;

/**
 *
 * @author admin
 */
public class Diem {
    private double tungDo;
    private double hoanhDo;


    /**
     * @return the tungDo
     */
    public double getTungDo() {
        return tungDo;
    }

    /**
     * @param tungDo the tungDo to set
     */
    public void setTungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    /**
     * @return the hoanhDo
     */
    public double getHoanhDo() {
        return hoanhDo;
    }

    /**
     * @param hoanhDo the hoanhDo to set
     */
    public void setHoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }
    
    public Diem(double tungDo, double hoanhDo) {
        this.tungDo = tungDo;
        this.hoanhDo = hoanhDo;
    }
    public void hienThi(){
            System.out.printf("(%.1f, %.1f)\t", this.hoanhDo, this.tungDo);
    }
    
    public double tinhKhoangCach (Diem d){
        return Math.sqrt(Math.pow(this.hoanhDo - d.hoanhDo, 2) 
                + Math.pow(this.tungDo -d.tungDo, 2));
    }
}
