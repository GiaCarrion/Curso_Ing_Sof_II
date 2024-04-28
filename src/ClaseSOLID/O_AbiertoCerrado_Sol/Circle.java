package ClaseSOLID.O_AbiertoCerrado_Sol;

class Circle extends Polygon {
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

    public double calcularArea(){
        return Math.PI*Math.pow(radius, 2);
    }
    
    
}