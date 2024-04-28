package ClaseSOLID.L_SustitucionLiskow_Sol;

public class Main {
    public static void main(String[] args) {
        Duck pato = new Duck();
        Sparrow loro = new Sparrow();
        Penguin pingu = new Penguin();

        System.out.println("Pato:");
        System.out.println("Comida: " + pato.eat());
        System.out.println("Sonido: " + pato.tweet());
        System.out.println(pato.fly());

        System.out.println("");

        System.out.println("Loro:");
        System.out.println("Comida: " + loro.eat());
        System.out.println("Sonido: " + loro.tweet());
        System.out.println(loro.fly());

        System.out.println("");

        System.out.println("Pinguino:");
        System.out.println("Comida: " + pingu.eat());
        System.out.println("Sonido: " + pingu.tweet());
        
    }
}

