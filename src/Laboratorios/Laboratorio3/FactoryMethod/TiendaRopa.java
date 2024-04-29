package Laboratorios.Laboratorio3.FactoryMethod;

public class TiendaRopa extends Tienda {
    public Producto metodoFabrica(String nombre, double precio, double costoEnvio){
        return new ProductoRopa(nombre, precio, costoEnvio);
    }
}
