package ClaseSOLID.S_RespUnica_Sol;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Square s1 = new Square(6);

        CalculationService cal1 = new CalculationService();

        double c1Area = c1.getArea();
        double s1Area = s1.getArea(); 

        double sumAreas = cal1.sumAreas(c1, s1);
        double difAreas = cal1.diffAreas(c1, s1);

        System.out.println("Datos del Circulo:");
        c1.mostrarDatos();
        System.out.println("Area = " + c1Area + "cm2");

        System.out.println("");

        System.out.println("Datos del Cuadrado:");
        s1.mostrarDatos();
        System.out.println("Area = " + s1Area + "cm2");
        
        System.out.println("");
        
        System.out.println("Suma de Areas = " + sumAreas);
        System.out.println("Diferencia de Areas = " + difAreas);
    }
}
