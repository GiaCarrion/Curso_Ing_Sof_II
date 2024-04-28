package ClaseSOLID.L_SustitucionLiskow_Sol;

public class Sparrow extends FlyingBird {

    @Override
    public String eat() {
        return "Insect";
    }

    @Override
    public String tweet() {
        return "Chirp";
    }

    @Override
    public String fly() {
        return "Puede volar";
    }

}