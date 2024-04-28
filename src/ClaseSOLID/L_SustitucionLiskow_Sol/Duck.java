package ClaseSOLID.L_SustitucionLiskow_Sol;

public class Duck extends FlyingBird {

    @Override
    public String eat() {
        return "Fish";
    }

    @Override
    public String tweet() {
        return "Quack";
    }

    @Override
    public String fly() {
        return "Puede volar";
    }

}