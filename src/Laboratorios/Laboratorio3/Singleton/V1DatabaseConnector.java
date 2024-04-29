package Laboratorios.Laboratorio3.Singleton;

import java.sql.Connection;

import java.sql.Connection; 
 
public class V1DatabaseConnector { 
 
    private Connection connection; 
 
    public V1DatabaseConnector() { 
        // Lógica de conexión a la base de datos 
        try { 
            System.out.println("Database connected"); 
        } catch (Error e) { 
            System.out.println("Error:" + e.getMessage()); 
        } 
    } 
}