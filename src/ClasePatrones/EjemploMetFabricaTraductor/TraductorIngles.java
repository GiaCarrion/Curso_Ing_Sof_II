package EjemploMetFabricaTraductor;

public class TraductorIngles extends Traductor {
    public String traducirNumero(int numero){
        String s = null;
        switch (numero) {
            case 1:
                s = "One";
                break;
            case 2:
                s = "Two";
            break;
            default:
                s = "No se puede Traducir";
            break;
        }
        return s;
    }
}
