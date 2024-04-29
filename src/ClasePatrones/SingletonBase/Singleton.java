package SingletonBase;

public class Singleton {
    private static Singleton nuevaInstancia = null;

    private Singleton(){}; //Constructor
    
    public static Singleton getNuevaInstancia() {
        if (nuevaInstancia == null) {
            nuevaInstancia = new Singleton();
        }
        return nuevaInstancia;
    }
}
