package Laboratorios.Laboratorio1.Ejercicio1;

/**
 *
 * @author giane
 */
public class Main {
    public static void main(String[] args) {
        Triangulo t1 = new Triangulo(4,6); 
        Triangulo t2 = new Triangulo(3,5);
        
        double t1Area = t1.calcularArea(); //
        double t2Area = t2.calcularArea();
        
        System.out.println("Datos del Triangulo 1:");
        t1.mostrarDatos();
        System.out.println("Area = " + t1Area);
        System.out.println("");
        System.out.println("Datos del Triangulo 2:");
        t2.mostrarDatos();
        System.out.println("Area = " + t2Area);
        System.out.println("");
        
        if (t1Area < t2Area) {
            System.out.println("El area del t1 es mayor al del t2");
        } else if (t1Area > t2Area) {
            System.out.println("El area del t1 es menor al del t2");
        } else {
            System.out.println("El area del t1 es igual al del t2");
        }
    }
}
