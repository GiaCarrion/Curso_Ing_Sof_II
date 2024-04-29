package ClaseSOLID.Ejercicios.solucion_CarritoCompras;

public class CarritoCompras {
    iPersistencia persistencia1;
    iMetodoPago metodoPago1;

    public CarritoCompras(iPersistencia persistencia1, iMetodoPago metodoPago1) {
        this.persistencia1 = persistencia1;
        this.metodoPago1 = metodoPago1;
    }

    public void comprar(Compra compra){
        persistencia1.guardar(compra);
        metodoPago1.pagar(compra);
    }
    
}
