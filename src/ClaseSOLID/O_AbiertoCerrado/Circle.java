package ClaseSOLID.O_AbiertoCerrado;

class Circle extends Polygon {
    int radius;
    
    public Circle(int radius) {
        super.type=2;
        this.radius = radius;
    }
    
    public int getRadius(){
        return this.radius;
    }
    
    
}