package ClaseSOLID.O_AbiertoCerrado;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(4);
        
        CalculationService calculationService = new CalculationService();
        
        float circleArea = calculationService.getArea(circle);
        System.out.println("Área del círculo: " + circleArea);

        float squareArea = calculationService.getArea(square);
        System.out.println("Área del cuadrado: " + squareArea);
    }
}
