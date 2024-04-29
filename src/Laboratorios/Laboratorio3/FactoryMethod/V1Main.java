package Laboratorios.Laboratorio3.FactoryMethod;

public class V1Main { 
 
    public static void main(String[] args) { 
        // Crear una instancia de la tienda 
        V1Tienda tienda = new V1Tienda(); 
 
        // Crear productos utilizando la tienda 
        V1Producto productoElectronico = tienda.crearProducto("electronico"); 
        V1Producto productoRopa = tienda.crearProducto("ropa"); 
 
        // Mostrar detalles de los productos 
        System.out.println("Producto electrónico:"); 
        mostrarDetallesProducto(productoElectronico); 
        System.out.println(); 
 
        System.out.println("Producto de ropa:"); 
        mostrarDetallesProducto(productoRopa); 
        System.out.println(); 
    } 
 
    // Método para mostrar los detalles de un producto 
    public static void mostrarDetallesProducto(V1Producto producto) { 
        System.out.println("Nombre: " + producto.obtenerNombre()); 
        System.out.println("Precio: $" + producto.obtenerPrecio()); 
        System.out.println("Costo de envío: $" + producto.calcularEnvio()); 
    } 
} 
