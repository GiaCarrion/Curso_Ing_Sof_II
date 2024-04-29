package EjemploMetFabricaTraductor;

public class Main {
    public static void main(String[] args) {
        Traductor traductor = TraductorFabrica.createTraductor("ingles");
        System.out.println(traductor.traducirNumero(1));
    }
}