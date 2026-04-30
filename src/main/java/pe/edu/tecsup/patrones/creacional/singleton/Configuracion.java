package pe.edu.tecsup.patrones.creacional.singleton;

public class Configuracion {

    private static Configuracion instance;

    public static Configuracion getInstance() {

        if (instance == null) {
            instance = new Configuracion();
        }

        return instance;
    }

    public String getUrlIA() {
        return "https://servidor.ia";
    }


}
