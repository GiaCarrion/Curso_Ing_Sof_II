package ClaseSOLID.O_AbiertoCerrado_Sol;

class Square extends Polygon {
    int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double calcularArea(){
        return Math.pow(side, 2);
    }
    
}
