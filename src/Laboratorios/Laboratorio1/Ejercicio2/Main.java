package Laboratorios.Laboratorio1.Ejercicio2;

/**
 *
 * @author giane
 */
public class Main {
    public static void main(String[] args) {
        Moto m1 = new Moto("Lineal", "Suzuki", "XYZ", 2013);
        Auto a1 = new Auto(4, "Toyota", "ABC", 2020);

        System.out.println("Datos de la Moto:");
        m1.mostrarDatos();
        System.out.println("");
        System.out.println("Datos del Auto:");
        a1.mostrarDatos();
    }
}
