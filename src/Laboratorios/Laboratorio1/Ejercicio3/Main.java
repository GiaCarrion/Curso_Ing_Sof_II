package Laboratorios.Laboratorio1.Ejercicio3;

/**
 *
 * @author giane
 */
public class Main {
    public static void main(String[] args) throws Exception {
        try {
            Circulo c1 = new Circulo(2);
            Rectangulo r1 = new Rectangulo(4,5);

            double c1Area = c1.calcularArea();
            double r1Area = r1.calcularArea();

            System.out.println("Mostrar datos del Circulo:");
            c1.mostrarDatos();
            System.out.println("Area = " + c1Area);

            System.out.println("");
            System.out.println("Mostrar datos del Rectangulo:");
            r1.mostrarDatos();
            System.out.println("Area = " + r1Area);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}
