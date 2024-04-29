package Laboratorios.Laboratorio3.FactoryMethod;

public class Main {

    public static void main(String[] args) {

        Tienda tiendaElectronica = new TiendaElectronica();
        Tienda tiendaRopa = new TiendaRopa();


        Producto productoElectronico = tiendaElectronica.metodoFabrica("Smartphone", 500.0, 10.0);
        Producto productoRopa = tiendaRopa.metodoFabrica("Polo", 50, 100);

        System.out.println("Producto electrónico:");
        mostrarDetallesProducto(productoElectronico);
        System.out.println();

        System.out.println("Producto de ropa:");
        mostrarDetallesProducto(productoRopa);
        System.out.println();
    }

    public static void mostrarDetallesProducto(Producto producto) {
        System.out.println("Nombre: " + producto.obtenerNombre());
        System.out.println("Precio: $" + producto.obtenerPrecio());
        System.out.println("Costo de envío: $" + producto.calcularEnvio());
    }
}
