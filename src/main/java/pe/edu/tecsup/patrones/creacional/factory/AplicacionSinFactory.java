package pe.edu.tecsup.patrones.creacional.factory;

public class AplicacionSinFactory {

    public static void main(String[] args) {


        Vehiculo sedan = new Sedan();
        sedan.realizarMantenimiento();

        Vehiculo bus = new Bus();
        bus.realizarMantenimiento();

        Vehiculo suv = new SUV();
        suv.realizarMantenimiento();

    }
}
