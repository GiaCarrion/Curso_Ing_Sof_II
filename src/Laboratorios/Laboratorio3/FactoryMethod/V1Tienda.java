package Laboratorios.Laboratorio3.FactoryMethod;

public class V1Tienda { 
 
    public V1Producto crearProducto(String tipo) { 
        if (tipo.equals("electronico")) { 
            return new V1Producto("Smartphone", 500.0, 10.0); 
        } else if (tipo.equals("ropa")) { 
            return new V1Producto("Camisa", 30.0, 5.0); 
        } else { 
            return null; 
        } 
    } 
}
