package pe.edu.tecsup.patrones.creacional.factory;

public class SUV implements Vehiculo{

    @Override
    public boolean realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del SUV");
        return true;
    }
}
