/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp18102;

/**
 *
 * @author ThuyVT
 */
public class SinhVienPoly extends SinhVien{
    int chuyenNganhHep;

    public SinhVienPoly() {
    }

    public SinhVienPoly(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public SinhVienPoly(int chuyenNganhHep, String maSV, String hoTen, String chuyenNganh) {
        super(maSV, hoTen, chuyenNganh);
        this.chuyenNganhHep = chuyenNganhHep;
    }

    public int getChuyenNganhHep() {
        return chuyenNganhHep;
    }

    public void setChuyenNganhHep(int chuyenNganhHep) {
        this.chuyenNganhHep = chuyenNganhHep;
    }
    
    public void inThongTin(SinhVienPoly sv) {
        super.inThongTin();
        String moTaChuyenNganhHep = "";
        
       // C1:
        if (sv.getChuyenNganhHep() == 1) {
            moTaChuyenNganhHep = "Java";
        } else if (sv.getChuyenNganhHep() == 2) {
             moTaChuyenNganhHep = "C#";
        }
        System.out.println("Chuyen nganh hep:" + moTaChuyenNganhHep);
        
        // C2:
        System.out.printf("Chuyen nganh hep: %s", sv.getChuyenNganhHep() == 1 ? "Java" : "C#");
    }
    
}
