package pe.edu.tecsup.patrones._3_comportamiento.strategy;

public class PagoTxBancaria implements Pago {

    @Override
    public boolean realizarPago(float dinero) {
        System.out.println("PagoTxBancaria.realizarPago dinero = " + dinero);
        return true;
    }

}
