package EjemploMetFabricaTraductor;

public class TraductorSpanish extends Traductor {
    public String traducirNumero(int numero){
        String s = null;

        switch (numero) {
            case 1:
                s = "Uno";
                break;
            
            case 2:
                s = "Dos";
                break;
        
            default:
                s = "No se puede traducir";
                break;
        }
        return s;
    }

}
