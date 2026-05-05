package pe.edu.tecsup.patrones._3_comportamiento.observer;

public class Aplicacion {

    public static void main(String[] args) {

        // Crear salon de class
        Classroom cr = new Classroom();

        // Agrego estudiantes
        cr.agregarEstudiante(new EstudianteImpl("Juan"));
        cr.agregarEstudiante(new EstudianteImpl("Silvia"));
        cr.agregarEstudiante(new EstudianteImpl("Pablo"));

        // Se envia un mensaje
        cr.enviarMensaje("El viernes 8 de mayo habra un examen");


    }
}
