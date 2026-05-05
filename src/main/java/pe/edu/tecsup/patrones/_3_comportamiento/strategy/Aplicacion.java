package pe.edu.tecsup.patrones._3_comportamiento.strategy;

public class Aplicacion {

    public static void main(String[] args) {
        Pago pago = factoryGetObj();
        float monto = 50;
        realizarPago(pago, monto);
    }

    private static Pago factoryGetObj() {
        // return new PagoTxBancaria();
        return new PagoPlin();
    }

    private static void realizarPago(Pago pago, float monto) {
        pago.realizarPago(monto);
    }
}
