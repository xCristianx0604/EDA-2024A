package lab04.ejercicio2;

class Nodo<T> {
    T valor;
    Nodo<T> izquierda, derecha;

    public Nodo(T item) {
        valor = item;
        izquierda = derecha = null;
    }
}

class ArbolBinario<T> {
    Nodo<T> raiz;

    public ArbolBinario() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol binario
    public void insertar(T valor) {
        raiz = insertarRec(raiz, valor);
    }

    // Función auxiliar para insertar un nuevo nodo de forma recursiva
    private Nodo<T> insertarRec(Nodo<T> raiz, T valor) {
        if (raiz == null) {
            raiz = new Nodo<T>(valor);
            return raiz;
        }

        // Si el valor es menor que el valor de la raíz, se inserta en el subárbol izquierdo
        if (valor.hashCode() < raiz.valor.hashCode())
            raiz.izquierda = insertarRec(raiz.izquierda, valor);
        // Si el valor es mayor que el valor de la raíz, se inserta en el subárbol derecho
        else if (valor.hashCode() > raiz.valor.hashCode())
            raiz.derecha = insertarRec(raiz.derecha, valor);

        return raiz;
    }

    // Método para recorrer el árbol binario en orden
    public void recorrerEnOrden() {
        recorrerEnOrdenRec(raiz);
    }

    // Función auxiliar para recorrer el árbol en orden
    private void recorrerEnOrdenRec(Nodo<T> raiz) {
        if (raiz != null) {
            recorrerEnOrdenRec(raiz.izquierda);
            System.out.print(raiz.valor + " ");
            recorrerEnOrdenRec(raiz.derecha);
        }
    }

    // Método para recorrer el árbol binario en preorden
    public void recorrerPreOrden() {
        recorrerPreOrdenRec(raiz);
    }

    // Función auxiliar para recorrer el árbol en preorden
    private void recorrerPreOrdenRec(Nodo<T> raiz) {
        if (raiz != null) {
            System.out.print(raiz.valor + " ");
            recorrerPreOrdenRec(raiz.izquierda);
            recorrerPreOrdenRec(raiz.derecha);
        }
    }

    // Método para recorrer el árbol binario en postorden
    public void recorrerPostOrden() {
        recorrerPostOrdenRec(raiz);
    }

    // Función auxiliar para recorrer el árbol en postorden
    private void recorrerPostOrdenRec(Nodo<T> raiz) {
        if (raiz != null) {
            recorrerPostOrdenRec(raiz.izquierda);
            recorrerPostOrdenRec(raiz.derecha);
            System.out.print(raiz.valor + " ");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ArbolBinario<Integer> arbol = new ArbolBinario<>();
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(60);
        arbol.insertar(80);

        System.out.println("Recorrido en orden del árbol:");
        arbol.recorrerEnOrden();
        System.out.println("\nRecorrido en preorden del árbol:");
        arbol.recorrerPreOrden();
        System.out.println("\nRecorrido en postorden del árbol:");
        arbol.recorrerPostOrden();
    }
}
