package pe.edu.tecsup.patrones.creacional.factory;

public class AplicacionSinFactory {

    public static void main(String[] args) {

        Vehiculo sedan = new Sedan();
        sedan.realizarMantenimiento();

    }
}
