package pe.edu.tecsup.patrones._1_creacional.builder.planteamiento_solucion_2;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Producto {

    private String nombre;
    private int precio;
    private int stock;

}
