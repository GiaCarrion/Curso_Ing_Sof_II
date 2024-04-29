package Laboratorios.Laboratorio3.AbstractFactoryMethod;

public class FabricaMueblesClasicos extends FabricaMueblesAbstracta {

    @Override
    public Silla crearSilla() {
        return new SillaClasica();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaClasica();
    }
}
