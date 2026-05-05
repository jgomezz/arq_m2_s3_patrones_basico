package pe.edu.tecsup.patrones._3_comportamiento.strategy;

public class PagoPlin implements Pago{
    @Override
    public boolean realizarPago(float dinero) {
        System.out.println("PagoPlin.realizarPago dinero = " + dinero);
        return true;
    }
}
