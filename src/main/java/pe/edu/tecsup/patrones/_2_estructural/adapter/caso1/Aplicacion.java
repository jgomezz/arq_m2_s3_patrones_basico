package pe.edu.tecsup.patrones._2_estructural.adapter.caso1;

public class Aplicacion {

    public static void main(String[] args) {

        Logger logger = new LoggerLegacy();

//        Logger logger = new Log4jAdapter();

        logger.log("Inicializar aplicacion");

    }
}
