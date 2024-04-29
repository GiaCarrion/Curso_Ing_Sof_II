package Laboratorios.Laboratorio3.Singleton;

import java.sql.Connection;

public class DatabaseConnector {
    
    private static DatabaseConnector instancia = null;

    private Connection connection; 
 
    private DatabaseConnector() { 
        // Lógica de conexión a la base de datos 
        try { 
            System.out.println("Database connected"); 
        } catch (Error e) { 
            System.out.println("Error:" + e.getMessage()); 
        } 
    }

    public static DatabaseConnector getInstancia() {
        if (instancia == null) {
            instancia = new DatabaseConnector();
        }
        return instancia;
    }

    
}
