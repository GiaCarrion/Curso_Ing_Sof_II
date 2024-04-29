package Laboratorios.Laboratorio2.InterfaceSegregationPrinciple;

public class RobotV1 implements Trabajador { 
 
    @Override 
    public void trabajar() { 
        System.out.println("Trabajando..."); 
    } 
 
    @Override 
    public void comer() { 
        throw new UnsupportedOperationException("Los robots no necesitan comer"); 
    } 
 
    @Override 
    public void descansar() { 

        throw new UnsupportedOperationException("Los robots no necesitan descansar"); 
    } 
 
    @Override 
    public void reunirse() { 
        throw new UnsupportedOperationException("Los robots no necesitan reunirse"); 
    } 
}
