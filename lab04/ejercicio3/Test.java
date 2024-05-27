package lab04.ejercicio3;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.println("BIENVENIDO A MI PROGRAMA PARA INGRESAR A ADUANAS");
        
        System.err.println("Ingrese el tipo de documento identidad (1: numero o 2: alfa numerico): ");
        int tipo = scanner.nextInt();
        
        if(tipo == 1){
            System.out.println("Ingrese el nombre del turista:");
            String nombre = scanner.next();
            System.out.println("Ingrese el documento de identidad del turista(numero): ");
            int documentoIdentidad = scanner.nextInt();
            System.out.println("Ingrese la nacionalidad del turista:");
            String nacionalidad = scanner.next();
            System.out.println("Ingrese la edad del turista:");
            int edad = scanner.nextInt();
            RegistroAduanas<Integer> turista = new RegistroAduanas<>(nombre, documentoIdentidad, nacionalidad, edad);
             // Mostrar los datos ingresados
            System.out.println("\nDatos del turista registrados en aduanas:");
            System.out.println(turista);
        }
        else if(tipo == 2) {
            System.out.println("Ingrese el nombre del turista:");
            String nombre = scanner.next();
            System.err.println("Ingrese el documento de identidad del turista(alfa numerico): ");
            String documentoIdentidad = scanner.next();
            System.out.println("Ingrese la nacionalidad del turista:");
            String nacionalidad = scanner.next();
            System.out.println("Ingrese la edad del turista:");
            int edad = scanner.nextInt();
            RegistroAduanas<String> turista = new RegistroAduanas<>(nombre, documentoIdentidad, nacionalidad, edad);
             // Mostrar los datos ingresados
            System.out.println("\nDatos del turista registrados en aduanas:");
            System.out.println(turista);
        }
        else
            System.err.println("ERROR DEBE INGRESAR 1 O 2");

        scanner.close();
    }
}
