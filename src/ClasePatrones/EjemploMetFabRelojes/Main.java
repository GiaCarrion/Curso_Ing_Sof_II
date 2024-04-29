package EjemploMetFabRelojes;

/**
 *
 * @author alumno
 */
public class Main {

    static int hora12 = 0;
    static int hora24 = 1;

    public static void main(String[] args) {
        Reloj r1 = FabricaReloj.CreateReloj(hora24);
        System.out.println(r1.DamelaHora());
        Reloj r2 = FabricaReloj.CreateReloj(hora12);
        System.out.println(r2.DamelaHora());
    }
}
