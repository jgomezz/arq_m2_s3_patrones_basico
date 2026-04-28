package pe.edu.tecsup.patrones.creacional.factory;

public class VehiculoFactory {

    /**
     *
     *
     * @param tipoVehiculo : SEDAN
     * @return
     */
    public static Vehiculo createVehiculo(String tipoVehiculo) {

        // TO DO
        if("SEDAN".equalsIgnoreCase(tipoVehiculo)){
            return new Sedan();
        } else {
            return null;
        }
    }
}
