
package controltemp;

public class Controlador {
     public String determinarEstado(double temp) {
     if (temp < 10) 
     return "Calefactor Activado";
     if (temp > 25) 
     return "Ventilador Activado";
     
      return "Sistema Inactivo";
    }
}
