package lab04.ejercicio1;
import java.util.*;;
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Seleccione el tipo de número (1: Entero, 2: Flotante): ");
        int tipo = sc.nextInt();
        
        if (tipo == 1) {
            System.out.println("Ingrese el primer número entero: ");
            int num1 = sc.nextInt();
            System.out.println("Ingrese el segundo número entero: ");
            int num2 = sc.nextInt();

            Calculator<Integer> intCalc = new Calculator<>(num1, num2);
            System.out.println("Suma: " + "\n"+ num1 + " + " + num2 + " = "+ intCalc.suma());
            System.out.println("Resta: " + "\n"+ num1 + " - " + num2 + " = "+ intCalc.resta());
            System.out.println("Multiplicación: " + "\n"+ num1 + " x " + num2 + " = "+ intCalc.multiplica());
            System.out.println("División: " +  "\n"+ num1 + " / " + num2 + " = "+ intCalc.divide());

        } else if (tipo == 2) {
            System.out.println("Ingrese el primer número flotante: ");
            double num1 = sc.nextDouble();
            System.out.println("Ingrese el segundo número flotante: ");
            double num2 = sc.nextDouble();

            Calculator<Double> doubleCalc = new Calculator<>(num1, num2);
            System.out.println("Suma: " + "\n"+ num1 + " + " + num2 + " = "+ doubleCalc.suma());
            System.out.println("Resta: " + "\n"+ num1 + " - " + num2 + " = "+ doubleCalc.resta());
            System.out.println("Multiplicación: " + "\n"+ num1 + " x " + num2 + " = "+ doubleCalc.multiplica());
            System.out.println("División: " +  "\n"+ num1 + " / " + num2 + " = "+ doubleCalc.divide());

        } else {
            System.out.println("Tipo de número no válido.");
        }

        sc.close();
    }
}
