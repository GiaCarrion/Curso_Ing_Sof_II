package ClaseSOLID.L_SustitucionLiskow;

public class Bird {

    public String eat(){
        return "Unknown food";
    }

    public String tweet(){
        return "Unknown sound";
    }
 
    public void fly(){
    }

    public void startFlying(){
        try {
            fly();
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }
    }
}
