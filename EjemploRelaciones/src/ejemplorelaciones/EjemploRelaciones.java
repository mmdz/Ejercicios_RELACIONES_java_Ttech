package ejemplorelaciones;

import ejemplorelaciones.entidades.Alumno;
import ejemplorelaciones.entidades.Curso;
import ejemplorelaciones.servicios.ServicioCurso;

public class EjemploRelaciones {

    public static void main(String[] args) {
        ServicioCurso sc = new ServicioCurso();
        Curso curso = sc.crearCurso();
        
        System.out.println(curso.getMateria());
        for (Alumno alumno : curso.getAlumnos()) {
            System.out.println(alumno.toString());
        }
    }
    
}
