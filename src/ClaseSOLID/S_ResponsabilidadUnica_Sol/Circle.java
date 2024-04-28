package ClaseSOLID.S_ResponsabilidadUnica;

public class Circle extends Polygon {
 
    int radius;
 
    public Circle(int radius){
        this.radius = radius;
    }
 
    public int getRadius(){
        return this.radius;
    }
 
    public void setRadius(int radius){
        this.radius = radius;
    }
 
    public double getArea(){
        return Math.PI * Math.pow(radius,2);
    }
 
}