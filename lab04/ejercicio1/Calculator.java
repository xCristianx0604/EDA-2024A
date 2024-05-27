package lab04.ejercicio1;

public class Calculator<T extends Number> {
    protected T num1;
    protected T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    // suma de 2 numeros Genericos tipo Number
    public Number suma() {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return num1.intValue() + num2.intValue();
        } else{
            return num1.doubleValue() + num2.doubleValue();
        }
    }
    // resta de 2 numeros Genericos tipo Number
    public Number resta() {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return num1.intValue() - num2.intValue();
        } else {
            return num1.doubleValue() - num2.doubleValue();
        }
    }
    // multiplicacion de 2 numeros Genericos tipo Number
    public Number multiplica() {
        if (num1 instanceof Integer && num2 instanceof Integer) {
            return num1.intValue() * num2.intValue();
        } else {
            return num1.doubleValue() * num2.doubleValue();
        }
    }
    /* Division de 2 numeros Genericos tipo Number 
    Uso Object para que me bote un String o Number
    */ 
    public Object divide() {
        if (num2.doubleValue() == 0) {
            return "Error: no se puede dividir por 0";
        }

        if (num1 instanceof Integer && num2 instanceof Integer) {
            return num1.intValue() / num2.intValue();
        } else {
            return num1.doubleValue() / num2.doubleValue();
        }
    }

}


