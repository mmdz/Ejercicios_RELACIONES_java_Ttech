 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ruletadeagua;

import ruletadeagua.entidades.Juego;
import ruletadeagua.servicios.ServicioJuego;


/**
 *
 * @author santi
 */
public class RuletaDeAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioJuego sj = new ServicioJuego();
        Juego juego = sj.llenarJuego();
        sj.ronda(juego);
    }
    
}
