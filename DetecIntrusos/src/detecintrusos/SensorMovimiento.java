
package detecintrusos;

import java.util.Random;


public class SensorMovimiento {
private Random random = new Random();
    
public boolean detectarMovimiento() {
 return random.nextBoolean(); 
    }
    
}
