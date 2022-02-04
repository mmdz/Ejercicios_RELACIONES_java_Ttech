package ruletadeagua.servicios;

import ruletadeagua.entidades.Revolver;


public class ServicioRevolver {
    
    public void llenarRevolver(Revolver revolver){
        revolver.setPosicionAgua((int)(Math.random()*6));
        revolver.setPosicionActual((int)(Math.random()*6));
    }
    
    public boolean mojar(Revolver revolver){
        return (revolver.getPosicionActual() == revolver.getPosicionAgua());
    }
    
    public void siguienteChorro(Revolver revolver){
        if (revolver.getPosicionActual()==5) {
            revolver.setPosicionActual(0);
        }else{
            revolver.setPosicionActual(revolver.getPosicionActual()+1);
        }
    }
            
}
