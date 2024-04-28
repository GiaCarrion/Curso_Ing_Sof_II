package ClaseSOLID.O_AbiertoCerrado_Sol;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Square s1 = new Square(4);
        
        double c1Area = c1.calcularArea();
        double s1Area = s1.calcularArea();
        
        System.out.println("Área del círculo: " + c1Area);

        System.out.println("Área del cuadrado: " + s1Area);
    }
}
