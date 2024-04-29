package Laboratorios.Laboratorio3.AbstractFactoryMethod;

class FabricaMueblesModernos extends FabricaMueblesAbstracta {

    @Override
    public Silla crearSilla() {
        return new SillaModerna();
    }

    @Override
    public Mesa crearMesa() {
        return new MesaModerna();
    }
}
