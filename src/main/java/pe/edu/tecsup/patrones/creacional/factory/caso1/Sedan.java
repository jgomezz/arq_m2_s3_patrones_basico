package pe.edu.tecsup.patrones.creacional.factory.caso1;

public class Sedan implements Vehiculo{

    @Override
    public boolean realizarMantenimiento() {
        System.out.println("Realizando mantenimiento de Sedan");
        return true;
    }
}
