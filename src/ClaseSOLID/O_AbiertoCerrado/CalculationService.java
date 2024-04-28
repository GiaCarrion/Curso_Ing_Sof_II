package ClaseSOLID.O_AbiertoCerrado;

class CalculationService {
    public float getArea(Polygon p) {
        float result = 0;
        if (p.type==1){
            result = areaSquare((Square) p);
        } else if (p.type==2){
            result = areaCircle((Circle) p);
        }
        return result;
    }

    public float areaCircle(Circle circle) {
        return (float)(Math.PI * Math.pow(circle.radius,2));
    }

    public float areaSquare(Square square) {
        return (float)Math.pow(square.side,2);
    }
 }
