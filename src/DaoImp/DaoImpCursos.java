/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DaoImp;

import Class.Cursos;
import Conexion.Conexion;
import Dao.DaoCursos;
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
public class DaoImpCursos implements DaoCursos {

    

    
    public ArrayList<Cursos> listarCursos() {
        ArrayList<Cursos> listC = new ArrayList<Cursos>();
        Cursos curso;
        try {
            Conexion conecion = new Conexion();
            Connection conn = null;
            conn = conecion.getConeccion(conn);
            String sqlmostrar = "Select * From Cursos";

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sqlmostrar);
            while (rs.next()) {
                curso = new Cursos();
                curso.setId(rs.getInt(1));
                curso.setNombre(rs.getString(2));

                listC.add(curso);
            }
            return listC;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
        return listC;
    }

    
    public void nuevosCursos(Cursos cursos) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Insert into Cursos(id,nombre) values (?,?)";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setInt(1, cursos.getId());
            psta.setString(2, cursos.getNombre());
            psta.execute();
            conn.commit();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    
    public void actualizarCursos(Cursos cursos) {
        try {
            Conexion conexion = new Conexion();
            Connection conn = null;
            conn = conexion.getConeccion(conn);
            String sqlinsertar = "Update Cursos set nombre=?  where id=?";
            PreparedStatement psta = conn.prepareStatement(sqlinsertar);
            psta.setString(1, cursos.getNombre());
            psta.setInt(2, cursos.getId());
            psta.execute();
            conn.commit();
            psta.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: " + e);
        }
    }

    
    public void eliminarCursos(int id) {
        try {
            Conexion coneccion = new Conexion();
            Connection conn = null;
            conn = coneccion.getConeccion(conn);
            String sqldelete = "Delete From Cursos where id=?";
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
