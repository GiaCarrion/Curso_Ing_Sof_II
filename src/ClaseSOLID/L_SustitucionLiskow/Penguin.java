package ClaseSOLID.L_SustitucionLiskow;

public class Penguin extends Bird {

    @Override
    public String eat() {
        return "Fish";
    }

    @Override
    public String tweet() {
        return "Squawk";
    }

    @Override
    public void fly() {
        throw new UnsupportedOperationException("Penguins can't fly");
    }

}
