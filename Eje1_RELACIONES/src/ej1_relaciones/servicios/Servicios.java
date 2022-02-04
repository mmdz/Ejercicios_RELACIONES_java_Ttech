package ej1_relaciones.servicios;

import ej1_relaciones.entidades.Perro;
import ej1_relaciones.entidades.Persona;
import java.util.Scanner;

public class Servicios {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Perro crearPerro() {
        Perro can = new Perro();

        System.out.println("Ingrese nombre: ");
        can.setNombre(leer.next());

        System.out.println("Ingrese edad: ");
        can.setEdad(leer.nextInt());

        System.out.println("Ingrese raza: ");
        can.setRaza(leer.next());

        System.out.println("Ingrese tamaño: ");
        can.setTamanio(leer.next());

        return can;
    }

    public Persona crearPersona(Perro p1, Perro p2, int eleccion) {
        Persona per = new Persona();

        System.out.println("Ingrese nombre: ");
        per.setNombre(leer.next());

        System.out.println("Ingrese apellido: ");
        per.setApellido(leer.next());

        System.out.println("Ingrese edad: ");
        per.setEdad(leer.nextInt());

        System.out.println("Ingrese documento: ");
        per.setDni(leer.nextInt());

        String salir = "";//inicializo la variable
        do {

            System.out.println("Qué perro quiere adoptar? 1 o 2? \nPerro 1: " + p1.getNombre() + "\nPerro 2: " + p2.getNombre());
            int opcion = leer.nextInt();

            // int eligio = 0;
            switch (opcion) {
                case 1:
                    if (eleccion == 0 || eleccion == 2) {
                        per.setEleccion(1); //al main
                        per.setPerro(p1);
                        salir = "S";
                    } else {
                        if (eleccion == 1) {
                            System.out.println("El perro ya fue adoptado, elija otro");
                            salir = "N";
                        }
                    }
                    break;
                case 2:
                    if (eleccion == 0 || eleccion == 1) {
                        per.setPerro(p2);
                        per.setEleccion(2);
                        salir = "S";
                    } else {
                        if (eleccion == 2) {
                            System.out.println("El perro ya fue adoptado, elija otro");
                            salir = "N";
                        }
                    }

                    break;
                default:
                    System.out.println("Opcion invalida");
            }

        } while (!salir.equalsIgnoreCase("S"));

        return per;
    }

}
