/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Class.Cursos;
import java.util.List;

/**
 *
 * @author crist
 */
public interface DaoCursos {
    public List<Cursos> listarCursos();

    public void nuevosCursos(Cursos cursos);

    public void actualizarCursos(Cursos cursos);

    public void eliminarCursos(int id);
    
}
