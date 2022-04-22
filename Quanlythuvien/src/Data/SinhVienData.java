/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.SinhVien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gaara
 */
public class SinhVienData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public SinhVien dangNhap(String taiKhoan, String pass) {
        SinhVien sv = null;
        try{
            ps = Connect.getConnect().prepareStatement("SELECT * FROM Sinh_Vien where id = ? and Password=?");
            ps.setString(1, taiKhoan);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()) {
                sv = new SinhVien();
                sv.setIdSinhVien(rs.getString("id"));
                sv.setPassword(rs.getString("Password"));
                sv.setTuoi(rs.getString("Tuoi"));
                sv.setHoTen(rs.getString("Ten_Sinh_Vien"));
            }
        }
        catch(Exception e) {
            return sv = null;
        }
        return sv;
    }
    
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
     public static void InsertSinhVien(SinhVien sv) {
        String sql = "insert into Sinh_Vien(id,Password,Ten_Sinh_Vien,Tuoi,Lop) values(?,?,?,?,?)";
        try {
            ps = Connect.getConnect().prepareStatement(sql);
            ps.setString(1, sv.getIdSinhVien());
            ps.setString(2, sv.getPassword());
            ps.setString(3, sv.getHoTen());
            ps.setString(4, sv.getTuoi());
            ps.setString(5, sv.getLop());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Đã thêm sinh viên thành công!" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Sinh viên không được thêm" , "Thông báo", 2);
        }
    }
    
    public boolean UpdateSinhVien(SinhVien sv) {
        try {
            ps = Connect.getConnect().prepareStatement("UPDATE Sinh_Vien SET Password = ?, Ten_Sinh_Vien = ?, Tuoi = ? , Lop = ? where id = ?");
            ps.setString(5, sv.getIdSinhVien());
            ps.setString(1, sv.getPassword());
            ps.setString(2, sv.getHoTen());
            ps.setString(3, sv.getTuoi());
            ps.setString(4, sv.getLop());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteSinhVien(String maSV) {
        try {
            ps = Connect.getConnect().prepareStatement("DELETE FROM Sinh_Vien WHERE id = ?");
            ps.setString(1, maSV);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
    
}
