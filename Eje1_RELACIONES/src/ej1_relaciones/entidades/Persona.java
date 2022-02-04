package ej1_relaciones.entidades;

/*Persona con atributos: nombre, apellido, edad, documento y Perro.*/
public class Persona {
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer dni;
    private Perro perro;
    private int eleccion;
    
    public Persona(String nombre, String apellido, Integer edad, Integer dni, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.perro = perro;
    }
    
    public Persona(){}

    @Override
    public String toString() {
        return "**Datos de la persona**\n" + "Nombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nDni: " + dni +"\n"+ perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public int getEleccion() {
        return eleccion;
    }

    public void setEleccion(int eleccion) {
        this.eleccion = eleccion;
    }
    
    
}
