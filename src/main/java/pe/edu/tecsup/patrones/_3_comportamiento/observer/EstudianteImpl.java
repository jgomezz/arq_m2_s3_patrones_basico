package pe.edu.tecsup.patrones._3_comportamiento.observer;

public class EstudianteImpl implements Estudiante {

    private String nombre;

    public EstudianteImpl(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void escuchar(String msg) {
        System.out.print("Estudiante " + this.nombre);
        System.out.println(" escuchando el mensaje -> " + msg);
    }
}
