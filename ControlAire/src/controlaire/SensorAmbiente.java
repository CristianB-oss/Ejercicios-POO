
package controlaire;

import java.util.Random;


public class SensorAmbiente {
  
    private Random random = new Random();
    
    public double leerTemperatura() {
    return 25 + random.nextDouble() * 10; 
    }
    
    public double leerHumedad() {
        return 50 + random.nextDouble() * 30; 
    }
}
