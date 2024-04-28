package ClaseSOLID.S_ResponsabilidadUnica;

public class Square extends Polygon {

    int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return this.side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(side, 2);
    }

}