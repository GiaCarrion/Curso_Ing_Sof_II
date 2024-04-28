package ClaseSOLID.S_RespUnica_Sol;

public class CalculationService {
    public double sumAreas(Polygon poligon1, Polygon poligon2){
        return poligon1.getArea() + poligon2.getArea();
    }

    public double diffAreas(Polygon poligon1, Polygon poligon2){
        return poligon1.getArea() - poligon2.getArea();
    }
}