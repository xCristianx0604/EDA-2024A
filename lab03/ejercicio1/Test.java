package lab03.ejercicio1;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        System.out.println("ALUMNO QUE HEREDA DE PERSONA");

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresar el nombre del Alumno: ");
        String nombre = sc.nextLine();

        System.out.print("Ingresar la edad del Alumno: ");
        int edad = sc.nextInt();

        // Creamos una instancia de Alumno con los datos ingresados
        Alumno alumno = new Alumno(nombre, edad);
        // Mostramos la información del alumno
        alumno.mostrarInformacion();

        sc.close();
    }
}

