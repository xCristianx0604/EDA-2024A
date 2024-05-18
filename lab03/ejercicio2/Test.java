package lab03.ejercicio2;
import java.util.*;;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el nombre del objeto: ");
        String nombre = sc.nextLine();
        System.out.println("Ingrese el color del objeto: ");
        String color = sc.nextLine();
        System.out.println("Ingrese el material del objeto");
        String material = sc.nextLine();
        // Crear un objeto Objeto con los datos necesarios
        Objeto objeto = new Objeto(nombre,color,material);

        // Mostrar la información del objeto
        System.out.println(objeto);
        sc.close();
    }
}
