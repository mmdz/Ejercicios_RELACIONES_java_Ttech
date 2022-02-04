package ruletadeagua.servicios;

import java.util.List;
import ruletadeagua.entidades.Jugador;
import ruletadeagua.entidades.Revolver;

public class ServicioJugador {

    private ServicioRevolver sr = new ServicioRevolver();

    public void llenarJugador(List<Jugador> jugadores, int cantidadJugadores) {

        for (int i = 1; i <= cantidadJugadores; i++) { 
            Jugador j = new Jugador();
            j.setId(i); //le asigno nro de jugador
            j.setNombre("Jugador " + j.getId());//asigno nombre de jugador
            jugadores.add(j);//cargo la lista de jugadores
        }

    }

    public boolean disparo(Revolver revolver, Jugador jugador) {

        if (sr.mojar(revolver)) {
            jugador.setMojado(true);
            System.out.println(jugador.getNombre() + " se ha mojado ");
            return true;
        } else {
            System.out.println("El disparo no contenia agua");
            sr.siguienteChorro(revolver);
            return false;
        }

    }

}
