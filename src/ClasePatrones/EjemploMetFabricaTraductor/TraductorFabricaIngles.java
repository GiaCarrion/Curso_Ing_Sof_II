package EjemploMetFabricaTraductor;

public class TraductorFabricaIngles extends TraductorFabrica {
    public Traductor metodoFabrica(){
        return new TraductorIngles();
    }
}
