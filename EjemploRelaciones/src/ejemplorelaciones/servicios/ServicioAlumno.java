package ejemplorelaciones.servicios;

import ejemplorelaciones.entidades.Alumno;
import java.util.Scanner;


public class ServicioAlumno {
    
    public Alumno crearAlumno(){
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        Alumno alumno = new Alumno();
        
        System.out.println("nombre: ");
        alumno.setNombre(sc.next());
        System.out.println("Apellido:");
        alumno.setApellido(sc.next());
        System.out.println("DNI:");
        alumno.setDni(sc.nextLong());
        return alumno;
        
    }
    
    public void modificarNombre(){
        
    }

}
