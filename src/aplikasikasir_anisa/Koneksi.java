/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasikasir_anisa;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author user
 */
public class Koneksi {
    
    static Connection koneksiDB() {
        throw new UnsupportedOperationException("not supported yet.");
    }
    Connection koneksi =null;
    
    public static Connection KoneksiDB() {
    try {
        Class.forName("com,mysql.jbdc.Driver");
        Connection Koneksi=DriverManager.getConnection("jbdc:mysql://locslhost:3306/kasir_anisa","root","");
        return Koneksi;
    }   catch (Exception e) {
     
        JOptionPane.showMessageDialog(null, e);
        return null;
        
     }
    
        
    }
    }
  

