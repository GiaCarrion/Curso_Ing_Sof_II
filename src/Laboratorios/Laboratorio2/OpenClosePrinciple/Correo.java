package Laboratorios.Laboratorio2.OpenClosePrinciple;

public class Correo implements CanalComunicacion {
    public void enviarMensaje(String contenido){
        System.out.println("Enviando correo: " + contenido);
    };
}
