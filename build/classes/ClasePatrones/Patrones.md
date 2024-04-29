# **PATRONES CREACIONALES**

## **1) Singleton:**
Garantiza que una clase tenga una única instancia y proporciona un método para acceder a esa instancia desde cualquier parte del programa.  

*Singleton.java*

```
public class Singleton {
    private static Singleton nuevaInstancia = null;

    private Singleton(){}; //Constructor
    
    public static Singleton getNuevaInstancia() {
        if (nuevaInstancia == null) {
            nuevaInstancia = new Singleton();
        }
        return nuevaInstancia;
    }
}
```

*Main.java*

```
public class Main {
    public static void main(String[] args) {
        Singleton s,s1,s2,s3;
        s = Singleton.getNuevaInstancia();
        s1 = Singleton.getNuevaInstancia();
        s2 = Singleton.getNuevaInstancia();
        s3 = Singleton.g etNuevaInstancia();
        System.out.println(s );
        System.out.println(s1 );
        System.out.println(s2 );
        System.out.println(s3 );
    }
}
```
## **2) Factory Method:**
Define una interfaz para crear un objeto pero deja que las subclases decidan que clase instanciar. Delega la función de crear objetos a las subclases.

