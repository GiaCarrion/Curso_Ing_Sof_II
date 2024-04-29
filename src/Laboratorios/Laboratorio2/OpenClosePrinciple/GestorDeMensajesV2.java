package Laboratorios.Laboratorio2.OpenClosePrinciple;

public class GestorDeMensajesV2 { 
    public void enviarMensaje(CanalComunicacion canal, String contenido) { 
        canal.enviarMensaje(contenido);
    } 
}