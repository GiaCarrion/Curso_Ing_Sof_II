package ClaseSOLID.S_ResponsabilidadUnica;

public class Main
{
     public static void main (String args[]) {
          Circle circle = new Circle(5);
          Square square = new Square(6);
               
          CalculationService calculationService = new CalculationService();
          calculationService.sumAreas(circle, square);
     }
}
