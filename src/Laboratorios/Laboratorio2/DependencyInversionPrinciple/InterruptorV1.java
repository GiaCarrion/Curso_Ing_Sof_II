package Laboratorios.Laboratorio2.DependencyInversionPrinciple;

public class InterruptorV1 { 
 
    private LamparaV1 lampara; 
 
    public InterruptorV1() { 
        this.lampara = new LamparaV1(); 
    } 
    
    public void presionarInterruptor() {         
        lampara.encender(); 
    } 
}
