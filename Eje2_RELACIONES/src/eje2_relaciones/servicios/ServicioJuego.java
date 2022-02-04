package eje2_relaciones.servicios;

import eje2_relaciones.entidades.Juego;
import eje2_relaciones.entidades.Jugador;
import eje2_relaciones.entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó*/
public class ServicioJuego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private ServicioJugador serJugador = new ServicioJugador();//desde aca llamo los servicios jugador y
    private ServicioRevolver serRev = new ServicioRevolver(); //revolver para acceder a los metodos

    public Juego llenarJuego() {

        Juego juego = new Juego();

        System.out.println("Indique cuántos jugadores participarán(1-6):");
        Integer cantidadJugadores = leer.nextInt();

        if ((cantidadJugadores < 1) || (cantidadJugadores > 6)) {
            System.out.println("Cantidad inválida, por defecto serán 6 jugadores.");
            cantidadJugadores = 6;
            System.out.println("Cant jugadores " + cantidadJugadores);
        }else{
        System.out.println("Cant jugadores " + cantidadJugadores);
        }
        
        System.out.println("---");
        
        List<Jugador> jugadores = new ArrayList();
        serJugador.crearJugadores(jugadores, cantidadJugadores);//le paso la lista vacia
        juego.setJugadores(jugadores);//la devuelve llena

        Revolver revolver = new Revolver();
        serRev.llenarRevolver(revolver);//cargo el revolver
        juego.setRevolver(revolver);//lo guardo en el juego

        return juego;
    }

    public void ronda(Juego juego) {

        a:
        do {  //pongo un marcador para que corte cuando alguien se dispara       
            for (int i = 0; i < juego.getJugadores().size(); i++) {//segun el tamaño de la lista
                if (serJugador.disparo(juego.getRevolver(), juego.getJugadores().get(i))) {
                    //(pregunta si tenia agua,si se mojo el jugador),trae el nro d jugador
                    //de la lista de jugadores
                    break a;
                } else {
                    System.out.println("Siguiente ronda\n");
                }
            }
        } while (true);
        System.out.println("--");
        System.out.println("FINALIZÓ EL JUEGO");
    }

}
