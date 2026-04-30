package pe.edu.tecsup.patrones._1_creacional.builder.planteamiento_problema;

public class Aplicacion {

    public static void main(String[] args) {

        // Crear un producto con todos los atributos
        Producto prod1 = new Producto("Arroz", 4, 10);

        // Crear un producto con 2 valores de inicializacion : nombre y precio
        Producto prod2 = new Producto("Azucar", 6);

        // Crear un producto con 1 valor de inicializacion : nombre
        Producto prod3 = new Producto("Lenteja");

        // Crear un producto con 0 valor de inicializacion e
        Producto prod4 = new Producto();
    }
}
