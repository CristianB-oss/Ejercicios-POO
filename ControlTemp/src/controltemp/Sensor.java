
package controltemp;

import java.util.Random;


public class Sensor {
  private Random random = new Random();
     
     
    public double leerTemperatura() {
        return 5 + random.nextDouble() * 30; 
}
}