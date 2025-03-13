
package controlaire;


public class AireAcondicionado {
    
 private boolean encendido;
    
    public void encender() {
        encendido = true;
        System.out.println("Aire acondicionado encendido.");
    }
    
    public void apagar() {
        encendido = false;
        System.out.println("Aire acondicionado apagado.");
    }
    
    public boolean estaEncendido() {
        return encendido;
    }
  
}
