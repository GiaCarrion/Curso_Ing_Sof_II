package ClaseSOLID.L_SustitucionLiskow;

public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck();
        Sparrow sparrow = new Sparrow();
        Penguin penguin = new Penguin();

        System.out.println("Duck:");
        System.out.println("Eats: " + duck.eat());
        System.out.println("Makes sound: " + duck.tweet());
        duck.startFlying();
        System.out.println();

        System.out.println("Sparrow:");
        System.out.println("Eats: " + sparrow.eat());
        System.out.println("Makes sound: " + sparrow.tweet());
        sparrow.startFlying();
        System.out.println();

        System.out.println("Penguin:");
        System.out.println("Eats: " + penguin.eat());
        System.out.println("Makes sound: " + penguin.tweet());
        sparrow.startFlying();
        System.out.println();
    }
}

