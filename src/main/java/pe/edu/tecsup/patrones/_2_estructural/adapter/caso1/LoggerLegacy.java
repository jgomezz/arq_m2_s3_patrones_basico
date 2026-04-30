package pe.edu.tecsup.patrones._2_estructural.adapter.caso1;

public class LoggerLegacy implements Logger {

    @Override
    public void log(String msg) {
        System.out.println("[Legacy INFO]: " + msg);
    }
}
