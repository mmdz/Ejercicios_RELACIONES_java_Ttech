package ej1_relaciones.entidades;
/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño*/

public class Perro {
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;

    public Perro(){}
    
    public Perro(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "**Datos del perro**\n" + "Nombre: " + nombre + "\nRaza: " + raza + "\nEdad: " + edad + "\nTamanio: " + tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

        
}
