
package controlaire;

public class ControlAire {

  public static void main(String[] args) throws InterruptedException {
       
   SensorAmbiente sensor = new SensorAmbiente();
   AireAcondicionado aire = new AireAcondicionado();
        
   while (true) {
   double temperatura = sensor.leerTemperatura();
   double humedad = sensor.leerHumedad();
            
    if ((temperatura > 28 && humedad > 60) || temperatura > 30) {
         aire.encender();
    }
    
   
    else{
     aire.apagar();
       }
            
 System.out.printf("Temperatura: %.2f°C, Humedad: %.2f%% - Estado del aire: %s%n", 
 temperatura, humedad, aire.estaEncendido() ? "Encendido" : "Apagado");
  Thread.sleep(5000);
}

  }
}