/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package th.mycompany.th;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem diemBenTrai;
    private Diem diemDuoiPhai;

    public DoanThang(Diem diemBenTrai, Diem diemDuoiPhai) {
        this.diemBenTrai = diemBenTrai;
        this.diemDuoiPhai = diemDuoiPhai;
    }
    
    

    /**
     * @return the diemBenTrai
     */
    public Diem getDiemBenTrai() {
        return diemBenTrai;
    }

    /**
     * @param diemBenTrai the diemBenTrai to set
     */
    public void setDiemBenTrai(Diem diemBenTrai) {
        this.diemBenTrai = diemBenTrai;
    }

    /**
     * @return the diemDuoiPhai
     */
    public Diem getDiemDuoiPhai() {
        return diemDuoiPhai;
    }

    /**
     * @param diemDuoiPhai the diemDuoiPhai to set
     */
    public void setDiemDuoiPhai(Diem diemDuoiPhai) {
        this.diemDuoiPhai = diemDuoiPhai;
    }
    
    public void hienThi(){
        System.out.printf("[(%.1f, %.1f), (%.1f, %.1f)]", 
                this.diemBenTrai.getHoanhDo(),
                this.diemBenTrai.getTungDo(),
                this.diemDuoiPhai.getHoanhDo(),
                this.diemDuoiPhai.getTungDo());
    }
    public double doDai(){
        return this.diemBenTrai.tinhKhoangCach(this.diemDuoiPhai);
    }
    public Diem timTrungDiem(){
        double x = (this.diemBenTrai.getHoanhDo()+this.diemDuoiPhai.getHoanhDo())/2;
        double y = (this.diemBenTrai.getTungDo()+this.diemDuoiPhai.getTungDo())/2;
        
        return new Diem(x,y);
    }
    public boolean isSongSong (DoanThang dt){
        double b1= ((this.diemBenTrai.getHoanhDo() - this.diemDuoiPhai.getHoanhDo())*
                (dt.diemBenTrai.getTungDo()-dt.diemDuoiPhai.getTungDo()));
        double b2= ((this.diemBenTrai.getTungDo() - this.diemDuoiPhai.getTungDo())*
                (dt.diemBenTrai.getHoanhDo()-dt.diemDuoiPhai.getHoanhDo()));
        return b1==b2;
    }
}

