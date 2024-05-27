package lab04.ejercicio3;

public class RegistroAduanas<T> {
    private String nombre;
    private T documentoIdentidad;
    private String nacionalidad;
    private int edad;

    public RegistroAduanas(String nombre, T documentoIdentidad, String nacionalidad, int edad) {
        this.nombre = nombre;
        this.documentoIdentidad = documentoIdentidad;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\n" +
               "Documento de identidad: " + documentoIdentidad + "\n" +
               "Nacionalidad: " + nacionalidad + "\n" +
               "Edad: " +edad ;
            }

}