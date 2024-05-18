package lab03.ejercicio1;
public class Persona {
    // Atributos de la clase Persona
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }
}
