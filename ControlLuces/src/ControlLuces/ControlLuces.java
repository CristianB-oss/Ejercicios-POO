
package ControlLuces;


public class ControlLuces {

    
 public static void main(String[] args) throws InterruptedException {
    
    SensorMovimiento sensor = new SensorMovimiento();
    Luces luces = new Luces();
    boolean esDeNoche = true;
        
   while (true) {
   boolean hayMovimiento = sensor.detectarMovimiento();
            
    if (esDeNoche && hayMovimiento) {
      luces.encender();
    } 
    else {
      luces.apagar();
     }
            
    System.out.println("Estado de las luces: " + (luces.estanEncendidas() ? "Encendidas" : "Apagadas"));
    Thread.sleep(10000);
        }
    }
        
    }
    

