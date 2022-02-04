package eje3_relaciones.entidades;

import java.util.ArrayList;
import java.util.List;

/* Una carta tiene un número entre 1 y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta
clase debe contener un método toString() que retorne el número de carta y el palo. La
baraja estará compuesta por un conjunto de cartas, 40 exactamente.*/

public class Baraja {
    private Integer numero;
    private String palo;
    private List<String>mazo = new ArrayList();
     
    public Baraja(){        
    }

    public Baraja(Integer numero, String palo,List<String>mazo) {
        this.numero = numero;
        this.palo = palo;
        this.mazo = mazo;
    }

    @Override
    public String toString() {
        return "Baraja: \n" + "nro de carta: " + numero + ", palo: " + palo + "\n";
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public List<String> getMazo() {
        return mazo;
    }

    public void setMazo(List<String> mazo) {
        this.mazo = mazo;
    }
    
    
 
}
