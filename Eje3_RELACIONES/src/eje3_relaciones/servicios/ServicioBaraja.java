package eje3_relaciones.servicios;

import eje3_relaciones.entidades.Baraja;
import eje3_relaciones.entidades.Palos;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.EnumSet;
import java.util.Iterator;

/* Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) 
y un palo (espadas, bastos, oros y copas). Esta clase debe contener un 
método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.*/
 /*Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya
más o se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número
de cartas. En caso de que haya menos cartas que las pedidas, no devolveremos
nada, pero debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta
y luego se llama al método, este no mostrara esa primera carta.*/
public class ServicioBaraja {

    Baraja baraja = new Baraja();

    public Baraja crearBaraja() {

        //guardo palo y numeros
        List<String> mazo = new ArrayList();

        for (int i = 1; i <= 4; i++) {
            if (i == 1) {
                baraja.setPalo("Espada");
            }
            if (i == 2) {
                baraja.setPalo("Oro");
            }
            if (i == 3) {
                baraja.setPalo("Copa");
            }
            if (i == 4) {
                baraja.setPalo("Basto");
            }

            for (int j = 1; j <= 10; j++) {//mazo contiene 40 cartas          
                baraja.setNumero(j);
                if (j == 8) {
                    baraja.setNumero(10);
                }
                if (j == 9) {
                    baraja.setNumero(11);
                }
                if (j == 10) {
                    baraja.setNumero(12);
                }
                //  System.out.println(baraja.getPalo() +" "+ baraja.getNumero());
                mazo.add(baraja.getNumero() + " " + baraja.getPalo());
            }
            System.out.println("-----");
        }

        baraja.setMazo(mazo);//guardo las cartas en el mazo de la clase

        System.out.println("El mazo contiene:");
        System.out.println(baraja.getMazo());
        System.out.println("Cantidad de cartas creadas: " + baraja.getMazo().size());
                
        return baraja;
    }

    public void barajar() {//cambia posicion aleatoria
        int largo = baraja.getMazo().size();

        for (int i = 0; i < largo; i++) {
            int posicion = (int) (Math.random() * (largo));
            baraja.getMazo().set(posicion, baraja.getMazo().get(i));
            //  System.out.println("lugar "+posicion+", carta "+baraja.getMazo().get(i));
        }
        System.out.println("---"); 
        System.out.println("Baraja mezclada");
        System.out.println(baraja.getMazo());
        
        List.sort(baraja.getMazo());
        System.out.println("Mazo ordenado");
        System.out.println(baraja.getMazo());

    }

    public void siguienteCarta(int posicion) {
        /*devuelve la siguiente carta que está en la baraja, cuando no haya
    más o se haya llegado al final, se indica al usuario que no hay más cartas.*/

//        for (int i = 0; i < baraja.getMazo().size(); i++) {
//            
//        }
//// 

        
    }
    

    public void cartasDisponibles() {

    }

    public void darCartas() {

    }

    public void cartasMonton() {

    }

    public void mostrarMazo() {

    }

}
