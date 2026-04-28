package pe.edu.tecsup.patrones.creacional.factory;

public class AplicacionConFactory {

    public static void main(String[] args) {

        Vehiculo sedan = VehiculoFactory.createVehiculo("Sedan");
        sedan.realizarMantenimiento();

    }
}
