package lab03.ejercicio2;

public class Objeto implements Color, Material {
    private String color;
    private String material;
    private String nombre;

    // Constructor
    public Objeto(String nombre, String color, String material) {
        this.nombre = nombre;
        this.material = material;
        this.color = color;
    }

    // Implementación de los métodos de la interfaz Color
    public String getColor(){
        return color;
    }

    // Implementación de los métodos de la interfaz Material
    public String getMaterial(){
        return material;
    }

    // Método getter para el nombre
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "\n"+nombre + " de color "+color+ " y material de "+material;
    }

}