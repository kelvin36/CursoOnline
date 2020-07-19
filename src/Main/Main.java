/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import DaoImp.DaoImpCursos;
import Class.Cursos;
import DaoImp.DaoImpEstudiantes;
import Class.Estudiantes;

/**
 *
 * @author crist
 */
public class Main {
    public static void main(String[] args) {
        
          
        //DaoImpCursos daoimpCursos = new DaoImpCursos();
        //daoimpCursos.nuevosCursos(new Cursos(1, "Matematicas"));
        //daoimpCursos.nuevosCursos(new Cursos(2, "POO"));
        //daoimpCursos.nuevosCursos(new Cursos(3, "Ingles"));
        
        
        //daoimpCursos.actualizarCursos(new Cursos(3, "Programacion"));
        
        
        //daoimpCursos.eliminarCursos(3);
    
        //for (Cursos c : daoimpCursos.listarCursos()) {
        //    System.out.println(c);
        //}
        
        
        //---------------------------------------------
        
        DaoImpEstudiantes daoImpEstudiantes = new DaoImpEstudiantes();
        daoImpEstudiantes.nuevosEstudiantes(new Estudiantes(1, "Franco","Garcia","Francogar99@gmail.com"));
        daoImpEstudiantes.nuevosEstudiantes(new Estudiantes(2, "Karla","Marcial","karlam7@gmail.com"));
        daoImpEstudiantes.nuevosEstudiantes(new Estudiantes(3, "Luis","Perez","Luisper3z@gmail.com"));
        
        
        //daoImpEstudiantes.actualizarEstudiantes(new Estudiantes(3, "Raul", "Lopez", "raullop@hotmail.com"));
        
        
        //daoImpEstudiantes.eliminarEstudiantes(3);
        
        for (Estudiantes e : daoImpEstudiantes.listarEstudiantes()){
            System.out.println(e);
                }
    
    }
    
}

