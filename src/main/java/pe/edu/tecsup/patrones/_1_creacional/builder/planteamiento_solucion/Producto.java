package pe.edu.tecsup.patrones._1_creacional.builder.planteamiento_solucion;

public class Producto {

    private String nombre;
    private int precio;
    private int stock;

    public Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    private Producto(ProductoBuilder builder) {

        this.nombre = builder.nombre;
        this.precio = builder.precio;
        this.stock = builder.stock;

    }

    public int getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getNombre() {
        return nombre;
    }


    public static ProductoBuilder builder() {
        return new ProductoBuilder();
    }


    /**
     *  ProductoBuilder
     */
    public static class ProductoBuilder {
        private String nombre;
        private int precio;
        private int stock;

        public ProductoBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public ProductoBuilder precio(int precio) {
            this.precio = precio;
            return this;
        }

        public ProductoBuilder stock(int stock) {
            this.stock = stock;
            return this;
        }

        public Producto build() {
            return new Producto(this);
        }

    }


}
