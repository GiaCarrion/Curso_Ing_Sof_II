package ClaseSOLID.Ejercicios.problema_AnimalProblem;

public class Escorpion implements Animal{

    @Override
    public void alimentar() {
        System.out.println("Alimentar al Escorpion!!");        
    }

    @Override
    public void acariciar() {
        new Exception("Pero que haces");
    }
    
}
