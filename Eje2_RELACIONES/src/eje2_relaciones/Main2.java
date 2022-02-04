package eje2_relaciones;

import eje2_relaciones.entidades.Juego;
import eje2_relaciones.servicios.ServicioJuego;


/*Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se
trata de un número de jugadores, que, con un revolver de agua, el cual posee una sola
carga de agua, se dispara y se moja. Las clases a hacer del juego son las siguientes:

Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.*/

public class Main2 {

    public static void main(String[] args) {
        ServicioJuego serJuego = new ServicioJuego();   
        Juego juego = serJuego.llenarJuego();
        serJuego.ronda(juego);
     
    }

}
