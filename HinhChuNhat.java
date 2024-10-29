/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th.mycompany.th;

/**
 *
 * @author admin
 */
public class HinhChuNhat {
    private Diem diemTren;
    private Diem diemDuoi;

    public HinhChuNhat(Diem diemTren, Diem diemDuoi) throws Exception {
        if (diemDuoi.getHoanhDo() >= diemTren.getHoanhDo()
                && diemTren.getTungDo() >= diemDuoi.getTungDo()){
            this.diemTren = diemTren;
            this.diemDuoi = diemDuoi;}
        else
        {
            throw new Exception("Invalid data");
        }
    }

    /**
     * @return the diemTren
     */
    public Diem getDiemTren() {
        return diemTren;
    }

    /**
     * @param diemTren the diemTren to set
     */
    public void setDiemTren(Diem diemTren) {
        this.diemTren = diemTren;
    }

    /**
     * @return the diemDuoi
     */
    public Diem getDiemDuoi() {
        return diemDuoi;
    }

    /**
     * @param diemDuoi the diemDuoi to set
     */
    public void setDiemDuoi(Diem diemDuoi) {
        this.diemDuoi = diemDuoi;
    }
    
    public double tinhDienTich (){
        double c1 = this.diemDuoi.getHoanhDo() - this.diemTren.getHoanhDo();
        double c2 = this.diemDuoi.getTungDo() - this.diemTren.getTungDo();
        return c1 * c2;
    }
    public double tinhChuVi (){
        double c1 = this.diemDuoi.getHoanhDo() - this.diemTren.getHoanhDo();
        double c2 = this.diemDuoi.getTungDo() - this.diemTren.getTungDo();
        return (c1+c2)*2;
    }
}
