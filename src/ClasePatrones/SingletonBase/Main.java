package SingletonBase;

public class Main {
    public static void main(String[] args) {
        Singleton s,s1,s2,s3;
        s = Singleton.getNuevaInstancia();
        s1 = Singleton.getNuevaInstancia();
        s2 = Singleton.getNuevaInstancia();
        s3 = Singleton.getNuevaInstancia();
        System.out.println(s );
        System.out.println(s1 );
        System.out.println(s2 );
        System.out.println(s3 );
    }
}