/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.sql.Date;

/**
 *
 * @author Gaara
 */
public class PhieuMuon {
    private String maMuon;
    private String maSinhVien;
    private String maSach;
    private Date ngayMuon;
    private Date hanTra;
    
    public PhieuMuon() {
        
    }
    
    public PhieuMuon(String maMuon, String maSinhVien, String maSach, Date ngayMuon, Date hanTra) {
        this.maMuon = maMuon;
        this.maSinhVien = maSinhVien;
        this.maSach = maSach;
        this.ngayMuon = ngayMuon;
        this.hanTra = hanTra;
    }
    
    public String getMaMuon() {
        
        return maMuon;
    }
    public void setMaMuon(String mm) {
        this.maMuon = mm;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }
    
    public void setMaSinhVien(String mabd) {
        this.maSinhVien = mabd;
    }
   
    public String getSach() {
        return maSach;
    }
    public void setMaSach(String mm) {
        this.maSach = mm;
    }
    
    public Date getNgayMuon() {
        return ngayMuon;
    }
    public void setNgayMuon(Date nm) {
        this.ngayMuon = nm;
    }
    public Date getHanTra() {
        return hanTra;
    }
    public void setHanTra(Date ht) {
        this.hanTra = ht;
    }
    
    
}
