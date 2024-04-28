package ClaseSOLID.S_RespUnica_Sol;

public class Circle extends Polygon {
 
    int radius;
 
    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }

    public void mostrarDatos(){
        System.out.println("Radio = " + radius + " cm");
    }
 
}