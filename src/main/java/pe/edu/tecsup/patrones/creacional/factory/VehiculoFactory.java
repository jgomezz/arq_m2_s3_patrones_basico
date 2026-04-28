package pe.edu.tecsup.patrones.creacional.factory;

public class VehiculoFactory {

    /**
     *
     *
     * @param tipoVehiculo : SEDAN, SUV y BUS
     * @return
     */
    public static Vehiculo createVehiculo(String tipoVehiculo) {

        // TO DO
        if("SEDAN".equalsIgnoreCase(tipoVehiculo)) {
            return new Sedan();
        }  else if("SUV".equalsIgnoreCase(tipoVehiculo)) {
            return new SUV();
        } else if("BUS".equalsIgnoreCase(tipoVehiculo)) {
            return new Bus();
        } else {
            return null;
        }
    }
}
