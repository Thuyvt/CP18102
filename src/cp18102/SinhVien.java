/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp18102;

/**
 *
 * @author ThuyVT
 */
public class SinhVien  implements Comparable<SinhVien>{
    private String maSV;
    private String hoTen;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String hoTen, String chuyenNganh) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
     // In thong tin sinh vien
    public void inThongTin() {
        System.out.println("Ma sinh vien: " + this.getMaSV() );
        System.out.printf("Ten sinh vien %s \n", this.getHoTen());
        System.out.println("Ten chuyen nganh: " + this.getChuyenNganh());
    }

    @Override
    public int compareTo(SinhVien o) {
        return this.getChuyenNganh().compareTo(o.getChuyenNganh());
    }
    
}
