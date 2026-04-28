package pe.edu.tecsup.patrones.creacional.factory.caso2;

public class AeronaveFactory {

    public static Aeronave createAeronave(String tipoAeronave) {

        if("F16".equalsIgnoreCase(tipoAeronave)){
            return new F16();

        } else {
            throw new RuntimeException("Tipo de Aeronave no es valido");
        }

    }

}
