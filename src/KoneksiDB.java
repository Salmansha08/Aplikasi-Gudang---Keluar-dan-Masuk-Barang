
import java.sql.*;
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ACER
 */
public class KoneksiDB{
    public static Connection koneksi;
    public static Connection configDB()throws SQLException{
        try{
            String url="jdbc:mysql://localhost/db_barang"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi=DriverManager.getConnection(url, user, pass);
           //JOptionPane.showMessageDialog(null, "Berhasil Koneksi");
        } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Gagal Koneksi");
          System.err.println("koneksi gagal "+e.getMessage()); //perintah menampilkan error pada koneksi
        }
        
        return koneksi;
    }
    
    /*
    //buat tes aja. klo udh bisa di comment 
    public static void main(String args[]) throws SQLException {
   
       java.sql.Connection Vconn = (Connection)KoneksiDB.configDB(); //memanggil fungsi koneksi dikelas lainnya
   }*/
    
}

