package eje2_relaciones.entidades;

/*Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado
(indica si está mojado o no el jugador). El número de jugadores será decidido por el
usuario, pero debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.*/
public class Jugador {
    //atributos 
    private Integer idJugador; //nro de jugador
    private String nombre;
    private Boolean mojado;
    
    //constructor
    public Jugador(){ 
        this.mojado = false;//lo inicializo       
    }
    
    public Jugador(Integer idJugador, String nombre, Boolean mojado) {
        this.idJugador = idJugador;
        this.nombre = nombre;
        this.mojado = mojado;
    }
    
    //getter, setter, toString

    @Override
    public String toString() {
        return "Jugador{" + "idJugador=" + idJugador + ", nombre=" + nombre + ", mojado=" + mojado + '}';
    }

    public Integer getIdJugador() {
        return idJugador;
    }

    public void setIdJugador(Integer idJugador) {
        this.idJugador = idJugador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Boolean getMojado() {
        return mojado;
    }

    public void setMojado(Boolean mojado) {
        this.mojado = mojado;
    }
    
}
