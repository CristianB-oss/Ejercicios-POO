
package controltemperatura;


public class Luces {
    
private boolean encendidas;
    
public void encender() {
    encendidas = true;
    System.out.println("Luces encendidas.");
    }
    
 public void apagar() {
     encendidas = false;
     System.out.println("Luces apagadas.");
    }
    
 public boolean estanEncendidas() {
    return encendidas;
    }   
 
}
