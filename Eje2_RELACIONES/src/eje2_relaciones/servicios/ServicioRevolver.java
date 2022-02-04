package eje2_relaciones.servicios;

import eje2_relaciones.entidades.Revolver;
import java.util.Objects;

/*Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)*/
public class ServicioRevolver {

    public void llenarRevolver(Revolver revolver) {
        revolver.setPosicionActual((int)(Math.random()*6));//cuenta de 0 a 5
        revolver.setPosicionAgua((int)(Math.random()*6));
    }

    public Boolean mojar(Revolver revolver) {
        
        return (Objects.equals(revolver.getPosicionAgua(), revolver.getPosicionActual()));

    }

    public void siguienteChorro(Revolver revolver) {
        
        if (revolver.getPosicionActual() == 5) {
            revolver.setPosicionActual(0); //vuelve al inicio
        } else {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);//pasa a la siguiente
        }
    }
   
}
