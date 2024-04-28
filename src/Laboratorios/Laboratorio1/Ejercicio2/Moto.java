package Laboratorios.Laboratorio1.Ejercicio2;

/**
 *
 * @author giane
 */
public class Moto extends Vehiculo {
    private String tipo;

    public Moto(String tipo, String marca, String modelo, int anio) {
        super(marca, modelo, anio);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void mostrarDatos(){
        super.mostrarDatos();
        System.out.println("Tipo = " + tipo);
    }
}
