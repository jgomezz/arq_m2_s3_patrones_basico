package pe.edu.tecsup.patrones._1_creacional.factory.caso1;

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
            throw new RuntimeException("Vehiculo no existe");
        }
    }
}
