package pe.edu.tecsup.patrones.creacional.singleton;

public class Aplicacion {

    public static void main(String[] args) {

        // Casuistica 1
        Configuracion config1 = Configuracion.getInstance(); //new Configuracion();
        System.out.println("config1 = " + config1);
        String urlIA = config1.getUrlIA();
        procesarConsulta(urlIA, "Como estas hoy dia?");

        // Casuistica 2
        Configuracion config2 = Configuracion.getInstance(); // new Configuracion();
        System.out.println("config2 = " + config2);
        String urlIA2 = config2.getUrlIA();
        procesarConsulta(urlIA2, "Que hora es?");




    }

    private static void procesarConsulta(String urlIA, String comoEstasHoyDia) {
    }
}
