/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import Class.Estudiantes;
import Conexion.Conexion;
import Dao.DaoEstudiantes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


/**
 *
 * @author crist
 */
public class DaoImpEstudiantes implements DaoEstudiantes{
    
    
    public ArrayList<Estudiantes> listarEstudiantes() {
        ArrayList<Estudiantes> listE = new ArrayList<Estudiantes>();
        Estudiantes estudiantes;
        try {
            Conexion conecion = new Conexion();
            Connection conn = null;
            conn = conecion.getConeccion(conn);
            String sqlmostrar = "Select * From Estudiantes";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlmostrar);
            while (rs.next()) {
                estudiantes = new Estudiantes();
                estudiantes.setId(rs.getInt(1));
                estudiantes.setNombre(rs.getString(2));
                estudiantes.setApellidos(rs.getString(3));
                estudiantes.setEmail(rs.getString(4));

                listE.add(estudiantes);
            }
            return listE;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listE;
    }

    
    public void nuevosEstudiantes(Estudiantes estudiantes) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Insert into Estudiantes(id,nombres,apellidos,email) values (?,?,?,?)";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setInt(1, estudiantes.getId());
            psta.setString(2, estudiantes.getNombre());
            psta.setString(3, estudiantes.getApellidos());
            psta.setString(4, estudiantes.getEmail());
            psta.execute();
            conn.commit();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    
    public void actualizarEstudiantes(Estudiantes estudiantes) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Update Estudiantes set  nombre=?  where id=? ";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            
            
            psta.setString(1, estudiantes.getNombre());
            
            psta.setInt(2, estudiantes.getId());
            
            
            psta.execute();
            conn.commit();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    
    public void eliminarEstudiantes(int id) {
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqldelete = "Delete From Estudiantes where id=?";
            PreparedStatement psta = conn.prepareStatement(sqldelete);
            psta.setInt(1, id);
            psta.execute();
            conn.commit();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    
    
}
