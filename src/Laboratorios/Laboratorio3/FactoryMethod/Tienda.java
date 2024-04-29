package Laboratorios.Laboratorio3.FactoryMethod;

public abstract class Tienda {
    abstract Producto metodoFabrica(String nombre, double precio, double costoEnvio); 
}
