package ClaseSOLID.S_ResponsabilidadUnica;

public class CalculationService {
    public void sumAreas(Polygon poligon1, Polygon poligon2){
        System.out.print(poligon1.getArea() + poligon2.getArea());
    }

    public void diffAreas(Polygon poligon1, Polygon poligon2){
        System.out.print(poligon1.getArea() - poligon2.getArea());
    }
}