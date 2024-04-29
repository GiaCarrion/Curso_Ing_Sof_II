package Laboratorios.Laboratorio3.FactoryMethod;

public class V1Producto { 
 
    private String nombre; 
    private double precio; 
    private double costoEnvio; 
 
    public V1Producto(String nombre, double precio, double costoEnvio) { 
        this.nombre = nombre; 
        this.precio = precio; 
        this.costoEnvio = costoEnvio; 
    } 
 
    public String obtenerNombre() { 
        return nombre; 
    } 
 
    public double obtenerPrecio() { 
        return precio; 
    } 
 
    public double calcularEnvio() { 
        return costoEnvio; 
    } 
}
