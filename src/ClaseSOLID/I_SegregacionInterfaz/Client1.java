package ClaseSOLID.I_SegregacionInterfaz;

public class Client1 implements IOperationsService {

    @Override
    public boolean op1() {
        return true;
    }

    @Override
    public String op2() {
        throw new UnsupportedOperationException();
    }

    @Override
    public void op3() {
        throw new UnsupportedOperationException();
    }
}
