package EjemploMetFabricaTraductor;

public class TraductorFabricaSpanish extends TraductorFabrica {
    public Traductor metodoFabrica() {
        return new TraductorSpanish();
    };
}
