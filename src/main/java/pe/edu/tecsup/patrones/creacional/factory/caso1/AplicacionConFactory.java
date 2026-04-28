package pe.edu.tecsup.patrones.creacional.factory.caso1;

public class AplicacionConFactory {

    public static void main(String[] args) {

        Vehiculo sedan = VehiculoFactory.createVehiculo("SEDAN");
        sedan.realizarMantenimiento();

        Vehiculo bus = VehiculoFactory.createVehiculo("BUS");
        bus.realizarMantenimiento();

        Vehiculo suv = VehiculoFactory.createVehiculo("SUV");
        suv.realizarMantenimiento();

        Vehiculo otro = VehiculoFactory.createVehiculo("DESC");
        otro.realizarMantenimiento();

    }
}
