package Laboratorios.Laboratorio2.OpenClosePrinciple;

public class Main { 
 
    public static void main(String[] args) { 
        GestorDeMensajesV1 gestorV1 = new GestorDeMensajesV1(); 
 
        gestorV1.enviarMensaje("correo", "¡Hola, esto es un correo!"); 
        gestorV1.enviarMensaje("sms", "¡Hola, esto es un SMS!"); 
 
    } 
}
