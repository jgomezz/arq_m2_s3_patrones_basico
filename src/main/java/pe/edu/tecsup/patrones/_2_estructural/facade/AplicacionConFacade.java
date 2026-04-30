package pe.edu.tecsup.patrones._2_estructural.facade;

public class AplicacionConFacade {
    public static void main(String[] args) {

        System.out.println("----- Usando Facade -----");

        FacadeBD facade = new FacadeBD();

        facade.ejecutarConsulta("SELECT * FROM usuarios");

    }
}
