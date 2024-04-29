package Laboratorios.Laboratorio2.InterfaceSegregationPrinciple;

public class Main { 
 
    public static void main(String[] args) { 
        Trabajador humano1 = new HumanoV1(); 
        humano1.trabajar(); 
        humano1.comer(); 
        humano1.descansar(); 
        humano1.reunirse(); 
 
        Trabajador robot1 = new RobotV1(); 
        robot1.trabajar(); 

        HumanoTrabajador humano2 = new HumanoV2();
        humano2.trabajar();
        humano2.comer();
        humano2.descansar();
        humano2.reunirse();

        RobotTrabajador robot2 = new RobotV2(); 
        robot2.trabajar();
        
        

    } 
}
