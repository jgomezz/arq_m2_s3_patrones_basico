package pe.edu.tecsup.patrones._2_estructural.adapter.caso2;

import pe.edu.tecsup.patrones._2_estructural.adapter.caso1.Logger;
import pe.edu.tecsup.patrones._2_estructural.adapter.caso1.LoggerLegacy;

public class Aplicacion {

    public static void main(String[] args) {

        Logger logger = new LoggerLegacy();

//        Logger logger = new Log4jAdapter();

        logger.log("Inicializar aplicacion");

    }
}
