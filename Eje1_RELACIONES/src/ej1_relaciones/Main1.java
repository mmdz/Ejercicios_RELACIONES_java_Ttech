package ej1_relaciones;

import ej1_relaciones.entidades.Perro;
import ej1_relaciones.entidades.Persona;
import ej1_relaciones.servicios.Servicios;

/*Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de
dos clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase
Persona con atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener
que pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo,
mostrar desde la clase Persona, la información del Perro y de la Persona.*/
public class Main1 {

    public static void main(String[] args) {

        Servicios sp = new Servicios();

        System.out.println("Ingrese los datos del perro 1");
        Perro perro1 = sp.crearPerro();
        System.out.println("\n-----");

        System.out.println("Ingrese los datos del perro 2: ");
        Perro perro2 = sp.crearPerro();
        System.out.println("\n-----");

        System.out.println("Ingrese los datos de la persona 1: ");
        Persona persona1 = sp.crearPersona(perro1, perro2, 0);
        System.out.println(persona1.getNombre() + " adoptó a " + persona1.getPerro().getNombre());

        System.out.println("\n-----");

        System.out.println("Ingrese los datos de la persona 2: ");
        Persona persona2 = sp.crearPersona(perro1, perro2, persona1.getEleccion());
        System.out.println(persona2.getNombre() + " adoptó a " + persona2.getPerro().getNombre());
        System.out.println("\n-----");
        
        System.out.println("ADOPCIÓN 1:\n"+persona1);
                System.out.println("\n-----");
        System.out.println("ADOPCIÓN 2:\n"+persona2);


    }

}
