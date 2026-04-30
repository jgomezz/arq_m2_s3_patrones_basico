package pe.edu.tecsup.patrones._1_creacional.factory.caso2;

public class Aplicacion {
    public static void main(String[] args) {

        Aeronave aeronave
                = AeronaveFactory.createAeronave("F16");

        System.out.println("Aeronave: " + aeronave.tiempoMantenimiento());

    }
}
