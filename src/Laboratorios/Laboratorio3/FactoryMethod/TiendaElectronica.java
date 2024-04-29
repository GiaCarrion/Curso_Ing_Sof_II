package Laboratorios.Laboratorio3.FactoryMethod;

public class TiendaElectronica extends Tienda {
    public Producto metodoFabrica(String nombre, double precio, double costoEnvio) {
        return new ProductoElectronica(nombre, precio, costoEnvio);
    };
}
