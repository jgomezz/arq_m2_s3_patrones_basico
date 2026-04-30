package pe.edu.tecsup.patrones._1_creacional.builder.planteamiento_solucion;


public class Aplicacion {

    public static void main(String[] args) {

        // Crear un producto con todos los atributos
        // Producto prod1 = new Producto("Arroz", 4, 10);

        Producto prod1 = Producto.builder()
                .nombre("Arroz")
                .precio(4)
                .stock(10)
                .build();

        System.out.println(prod1.getStock());

        // Crear un producto con 2 valores de inicializacion : nombre y precio
        // Producto prod2 = new Producto("Azucar", 6);

        Producto prod2 = Producto.builder()
                .nombre("Azucar")
                .precio(6)
                .build();

        System.out.println(prod2.getPrecio());

        // Crear un producto con 1 valor de inicializacion : nombre
        // Producto prod3 = new Producto("Lenteja");

        Producto prod3 =  Producto.builder()
                .nombre("Lenteja")
                .build();

        System.out.println(prod3.getNombre());


        // Crear un producto con 0 valor de inicializacion e
        // Producto prod4 = new Producto();

        Producto prod4  =  Producto.builder()
                .build();

        System.out.println(prod4.toString());

    }
}
