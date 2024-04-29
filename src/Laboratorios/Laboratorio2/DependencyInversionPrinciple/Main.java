package Laboratorios.Laboratorio2.DependencyInversionPrinciple;

public class Main { 
 
    public static void main(String[] args) { 
        InterruptorV1 interruptor = new InterruptorV1(); 
        interruptor.presionarInterruptor();

        DispositivoElectronico lampara = new LamparaV2();
        InterruptorV2 interruptorLampara = new InterruptorV2(lampara);
        interruptorLampara.presionarInterruptor();
    } 
} 
