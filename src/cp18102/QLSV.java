/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cp18102;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 *
 * @author ThuyVT
 */
public class QLSV {
    List<SinhVien> listSinhVien = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public QLSV() {
    }
    
    // Nhap thong tin sinh vien
    public void nhapSv() {
        while (true) {
            // nhan thong tin sinh vien nhap vao tu ban phim
            SinhVien st = new SinhVien();
            System.out.println("Nhap ma sinh vien");
            st.setMaSV(sc.nextLine());
            System.out.println("Nhap ho va ten:");
            st.setHoTen(sc.nextLine());
            System.out.println("Nhap chuyen nganh:");
            st.setChuyenNganh(sc.nextLine());
            
            // Them doi tuong vao danh sach
            listSinhVien.add(st);
            System.out.println("Co muon nhap nhap tiep hay khong(Y/N)");
            if(sc.nextLine().trim().equalsIgnoreCase("N")) {
                break;
            }
        }
    }
    
    // Xuat danh sach
    public void xuatDanhSv() {
        if(listSinhVien.isEmpty()) {
            System.out.println("Khong co sinh vien trong danh sach");
        } else {
            for(SinhVien sv: listSinhVien) {
               sv.inThongTin();
            }
        }
    }
    
    // Tim sinh vien theo ma
    public void timSv() {
        System.out.println("Nhap maSv can tim: ");
        String maSv = sc.nextLine();
        // C1:
        for (SinhVien sinhvien: listSinhVien) {
            if (sinhvien.getMaSV().trim().equalsIgnoreCase(maSv)) {
                sinhvien.inThongTin();
            }
        }
        
        // C2:
        List<SinhVien> result = listSinhVien.stream()
                .filter(sv -> sv.getMaSV().trim().equalsIgnoreCase(maSv))
                .collect(Collectors.toList());
        result.forEach(s -> s.inThongTin());
    }
    
    // Sap xep danh sach sinh vien
    public void sapXepSv() {
        Collections.sort(listSinhVien);
        xuatDanhSv();
    }
}
