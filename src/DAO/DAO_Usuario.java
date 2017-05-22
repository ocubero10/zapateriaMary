/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;
import BL.BL_Usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Hermes
 */
public class DAO_Usuario {
    Connection con = null;

    public DAO_Usuario() {
    }
    
    
    public void conexion(){
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/zapateriamary", "root", "1234");
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void cerrarConexion(){
        try {
            this.con.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean logueo(BL_Usuario usuario, String nombreUsuario, String contrasena){
        conexion();
        Statement st = null;
        ResultSet rs = null;
        Boolean logueo = false;
        try {
            st = this.con.createStatement();
            rs = st.executeQuery("Select * From usuario where NombreUsuario = '"+nombreUsuario+"' And Contrasena = '"+contrasena+"';");
            while (rs.next()) {                
                logueo = true;
                usuario.setIdUsuario(rs.getInt(1));
                usuario.setNombreCompleto(rs.getString(2));
                usuario.setNombreUsuario(rs.getString(3));
                usuario.setContrasena(rs.getString(4));
                if (rs.getInt(5)== 1) {
                    usuario.setAdministrador(true);
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO_Usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        cerrarConexion();
        return logueo;
    }
}
