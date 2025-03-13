
package detecintrusos;


public class Alarma {
   
   private boolean activada;
   
 public void activar() {
    activada = true;
    System.out.println("Alarma activada.");
    }
    
    public void desactivar() {
    activada = false;
    System.out.println("Alarma desactivada.");
    }
    
    public boolean estaActivada() {
    return activada;
    }
   
}
