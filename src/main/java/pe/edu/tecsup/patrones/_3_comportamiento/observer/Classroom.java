package pe.edu.tecsup.patrones._3_comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Classroom {

    private List<Estudiante> estudiantes;

    public Classroom(){
        this.estudiantes = new ArrayList<>();
    }

    /**
     *  Enviar mensaje a todos
     * @param mensaje
     */
    public void enviarMensaje(String mensaje){

        System.out.println("Mensaje a enviar --> " + mensaje);

        // Avisar a cada estudiante
        for (Estudiante estudiante : this.estudiantes) {
            estudiante.escuchar(mensaje);
        }
    }

    /**
     * Agregar estudiantes al Classroom
     * @param estudiante
     */
    public void agregarEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
    }


}
