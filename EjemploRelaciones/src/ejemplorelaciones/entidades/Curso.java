package ejemplorelaciones.entidades;

import java.util.ArrayList;
import java.util.List;


public class Curso {

    private String materia;
    // uno a uno
    // uno a muchos
    // muchos a uno
    // muchos a muchos
    private List<Alumno> alumnos = new ArrayList();//uno a muchos, un curso a muchos alumnos

    private Alumno alumno;
    public Curso() {
    }

    public Curso(String materia, List<Alumno> alumnos) {
        this.materia = materia;
        this.alumnos=alumnos;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public String toString() {
        return "Curso{" + "materia=" + materia + ", alumnos=" + alumnos + '}';
    }
    
    
    
    
    
    
    
}
