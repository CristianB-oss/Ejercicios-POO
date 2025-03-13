
package controltemp;


public class ControlTemp {

    
    public static void main(String[] args)throws InterruptedException {
     
     Sensor sensor = new Sensor();
     Controlador controlador = new Controlador();
        
    while (true) {
    double temp = sensor.leerTemperatura();
    System.out.printf("Temperatura: %.2f°C - Estado: %s\n", temp, controlador.determinarEstado(temp));
    Thread.sleep(5000);
        }
    }
    
}
