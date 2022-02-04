package ruletadeagua.servicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ruletadeagua.entidades.Juego;
import ruletadeagua.entidades.Jugador;
import ruletadeagua.entidades.Revolver;

public class ServicioJuego {

    private ServicioJugador sj = new ServicioJugador();
    private ServicioRevolver sr = new ServicioRevolver();

    public Juego llenarJuego() {
        Scanner sc = new Scanner(System.in);
        Juego juego = new Juego();
        System.out.println("Ingrese la cantidad de Jugadores");
        int n = sc.nextInt();
        if (n < 1 || n > 6) {
            System.out.println("Cantidad invalida, se ingresara por defecto 6");
            n = 6;
        }
        List<Jugador> jugadores = new ArrayList();
        sj.llenarJugador(jugadores, n);
        juego.setJugadores(jugadores);
        
        Revolver r = new Revolver();
        sr.llenarRevolver(r);
        juego.setRevolver(r);

        return juego;
    }

    public void ronda(Juego j) {

        a: do {

            for (int i = 0; i < j.getJugadores().size(); i++) {
                if (sj.disparo(j.getRevolver(), j.getJugadores().get(i))) {
                    break a;
                } else {
                    System.out.println("Siguiente ronda");
                }
            }

        } while (true);
        System.out.println("finalizo el juego");

    }

}
