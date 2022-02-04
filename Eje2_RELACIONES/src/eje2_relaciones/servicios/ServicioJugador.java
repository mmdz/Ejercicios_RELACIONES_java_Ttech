package eje2_relaciones.servicios;

import eje2_relaciones.entidades.Jugador;
import eje2_relaciones.entidades.Revolver;
import java.util.List;

/*Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos: 
*disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
public class ServicioJugador {

    private ServicioRevolver serRev = new ServicioRevolver();

    public void crearJugadores(List<Jugador> jugadores, int cantidadJugadores) {

        for (int i = 0; i < cantidadJugadores; i++) {
            Jugador jugador = new Jugador(); //creo un nuevo jugador cada vez

            jugador.setIdJugador(i + 1);//le asigno nro de jugador
            jugador.setNombre("Jugador " + jugador.getIdJugador());//asigno nombre de jugador
            jugadores.add(jugador);//cargo la lista de jugadores
        }
    }

    public Boolean disparo(Revolver revolver, Jugador jugador) {
        
        if (serRev.mojar(revolver)) { //pregunta si es true
            jugador.setMojado(true);
            System.out.println(jugador.getNombre() + " se ha mojado.");
            return true;
        } else {
            serRev.siguienteChorro(revolver);
            System.out.println("El disparo no tenía agua.");
            return false;
        }
    }
}
