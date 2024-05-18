package lab03.ejercicio1;

public class Alumno extends Persona{
    // Constructor con parámetros
    public Alumno(String nombre, int edad) {
        super(nombre, edad); // Llama al constructor de la clase base (Persona)
    }

    // Método para mostrar la información del alumno
    public void mostrarInformacion() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
    }
}
