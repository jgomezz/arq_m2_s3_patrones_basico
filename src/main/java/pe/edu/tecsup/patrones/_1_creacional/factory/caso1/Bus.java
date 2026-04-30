package pe.edu.tecsup.patrones._1_creacional.factory.caso1;

public class Bus implements Vehiculo{

    @Override
    public boolean realizarMantenimiento() {
        System.out.println("Realizando mantenimiento del Bus");
        return true;
    }
}
