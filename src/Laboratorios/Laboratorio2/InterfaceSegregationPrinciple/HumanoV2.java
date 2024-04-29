package Laboratorios.Laboratorio2.InterfaceSegregationPrinciple;

public class HumanoV2 implements HumanoTrabajador { 
 
    @Override 
    public void trabajar() { 
        System.out.println("Trabajando..."); 
    }
 
    @Override 
    public void comer() { 
        System.out.println("Comiendo..."); 
    } 
 
    @Override 
    public void descansar() { 
        System.out.println("Descansando...");
    } 
 
    @Override 
    public void reunirse() { 
        System.out.println("Reunión..."); 
    } 
}
