package Laboratorios.Laboratorio1.Ejercicio3;

/**
 *
 * @author giane
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    public double calcularArea() throws Exception{
        if (radio < 0) {
            throw new Exception("El radio debe ser mayor a 0 y positivo");
        }
   
        return Math.PI * Math.pow(radio, 2);
    }
    
    public void mostrarDatos(){
        System.out.println("Radio = " + radio);
    }
}
