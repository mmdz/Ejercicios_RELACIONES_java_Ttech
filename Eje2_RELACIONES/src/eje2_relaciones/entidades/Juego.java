package eje2_relaciones.entidades;

import java.util.List;
import java.util.ArrayList;

/*Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de
Jugadores) y Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.*/
public class Juego {
    private List<Jugador>jugadores = new ArrayList();
    private Revolver revolver;

    public Juego(){}
    public Juego(List<Jugador> jugadores,Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
    
    
    
}
