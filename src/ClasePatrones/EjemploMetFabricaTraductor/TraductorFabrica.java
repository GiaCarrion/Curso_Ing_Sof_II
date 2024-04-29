package EjemploMetFabricaTraductor;

public abstract class TraductorFabrica {
    public TraductorFabrica(){};

    public abstract Traductor metodoFabrica();

    public static Traductor createTraductor(String idioma){
        Traductor traductor = null;
        
        if ("español".equals(idioma)) {
            traductor = new TraductorFabricaSpanish().metodoFabrica();
        } else if ("ingles".equals(idioma)) {
            traductor = new TraductorFabricaIngles().metodoFabrica();    
        }

        return traductor;
    };    
}
