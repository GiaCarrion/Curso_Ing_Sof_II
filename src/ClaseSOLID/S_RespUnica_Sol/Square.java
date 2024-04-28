package ClaseSOLID.S_RespUnica_Sol;

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

    public void mostrarDatos(){
        System.out.println("Lado = " + side + " cm");
    }

}