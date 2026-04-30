package pe.edu.tecsup.patrones._2_estructural.adapter.caso1;

public class Log4jAdapter implements Logger {

    private final Log4j log4j;

    public Log4jAdapter() {
        this.log4j = new  Log4j();
    }

    @Override
    public void log(String msg) {
        log4j.info(msg);
    }


}
