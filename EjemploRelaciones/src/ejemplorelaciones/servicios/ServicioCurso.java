package ejemplorelaciones.servicios;

import ejemplorelaciones.entidades.Alumno;
import ejemplorelaciones.entidades.Curso;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ServicioCurso {
    
    private ServicioAlumno servicioAlumno = new ServicioAlumno();

    public Curso crearCurso(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Curso curso = new Curso();
        
        System.out.println("Ingrese el nombre de la materia del curso");
        curso.setMateria(sc.next());
        
        System.out.println("Ingrese cantidad de alumnos a agregar");
        int n = sc.nextInt();
        List<Alumno> listaAlumnos = new ArrayList();
        for (int i = 0; i < n; i++) {
           listaAlumnos.add(servicioAlumno.crearAlumno());
        }
        curso.setAlumnos(listaAlumnos);
        return curso;
        
    }
   
    
}
