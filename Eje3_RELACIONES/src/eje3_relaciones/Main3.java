package eje3_relaciones;

import eje3_relaciones.entidades.Baraja;
import eje3_relaciones.servicios.ServicioBaraja;

/*Realizar una baraja de cartas españolas orientada a objetos.*/
public class Main3 {

    public static void main(String[] args) {
        ServicioBaraja sb = new ServicioBaraja();
        Baraja bar = sb.crearBaraja();

        sb.barajar();
        sb.siguienteCarta(1);

        sb.cartasDisponibles();
        sb.darCartas();

        sb.cartasMonton();
        sb.mostrarMazo();

    }

}
