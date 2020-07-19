/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Class.Estudiantes;
import java.util.List; 

/**
 *
 * @author crist
 */
public interface DaoEstudiantes {
    public List<Estudiantes> listarEstudiantes();

    public void nuevosEstudiantes(Estudiantes estudiantes);

    public void actualizarEstudiantes(Estudiantes estudiantes);

    public void eliminarEstudiantes(int id);
    
}
