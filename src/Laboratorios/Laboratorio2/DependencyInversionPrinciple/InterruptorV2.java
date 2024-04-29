package Laboratorios.Laboratorio2.DependencyInversionPrinciple;

public class InterruptorV2 { 
 
    private DispositivoElectronico dispositivo; 

    public InterruptorV2(DispositivoElectronico dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void presionarInterruptor() {         
        dispositivo.encender(); 
    } 
}
