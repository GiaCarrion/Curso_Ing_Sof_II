package ClaseSOLID.Ejercicios.solucion_CarritoCompras;

public class Main {
    public static void main(String[] args) {
        iPersistencia persistencia = new SQLDatabase();
        iMetodoPago metodoPago = new TarjetaCredito();

        CarritoCompras carrito = new CarritoCompras(persistencia, metodoPago);
    
        Compra compra = new Compra();
    
        carrito.comprar(compra);
    }

}
