package Laboratorios.Laboratorio3.Singleton;

public class Main { 
 
    public static void main(String[] args) { 
        // Crear una nueva instancia de DatabaseConnector y conectar a la base de datos 
        DatabaseConnector connector1 = DatabaseConnector.getInstancia();
 
        // Crear otra instancia de DatabaseConnector y conectar a la base de datos nuevamente 
        DatabaseConnector connector2 = DatabaseConnector.getInstancia();
    } 
 
}
