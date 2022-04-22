/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

public class Sach {
    private String maSach;
    private String tenSach;
    private String tenTacGia;
    private String nhaXB; 
    
    public Sach() {
        
    }
    
    public Sach(String maSach, String tenSach, String tenTacGia, String nhaXB) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTacGia = tenTacGia;
        this.nhaXB = nhaXB;
    }
    
    public String getMaSach() {
        return maSach;
    }
    
    public void setMaSach(String ms) {
        this.maSach = ms;
    }
    
    public String getTenSach() {
        return tenSach;
    }
    
    public void setTenSach(String ts) {
        this.tenSach = ts;
    }
    
    public String getTenTacGia() {
        return tenTacGia;
    }
    
    public void setTenTacGia(String ttg) {
        this.tenTacGia = ttg;
    }
    
    public String getNhaXB() {
        return nhaXB;
    }
    
    public void setNhaXB(String nxb) {
        this.nhaXB = nxb;
    }
}
