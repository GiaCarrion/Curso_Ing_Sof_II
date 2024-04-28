package ClaseSOLID.O_AbiertoCerrado;

class Square extends Polygon {
    int side;
    
    public Square(int side) {
        super.type=1;
        this.side = side;
    }
    
    public int getSide(){
        return this.side;
    }   
}
