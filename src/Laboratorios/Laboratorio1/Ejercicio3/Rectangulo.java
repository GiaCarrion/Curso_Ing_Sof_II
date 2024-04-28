package Laboratorios.Laboratorio1.Ejercicio3;

/**
 *
 * @author giane
 */
public class Rectangulo extends Figura{
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea() throws Exception{
        if (altura <= 0 || base <= 0) {
            throw new Exception("La base y altura deben ser diferentes a 0 y positivos");
        }
        return base*altura;
    }
    
    public void mostrarDatos(){
        System.out.println("Base = " + base);
        System.out.println("Altura = " + altura);
    }
}
