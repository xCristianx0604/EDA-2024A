package lab03.ejercicio3;

public class Test {
    public static void main(String[] args) {
        Ave ganzo = new Ganzo("Ganzo");
        Ave pato = new Pato("Pato");
        Ave gallina = new Gallina("Gallina");

        // Polimorfismo: cada tipo de ave hace un sonido diferente
        ganzo.hacerSonido();  // Hace un sonido de ganzo
        pato.hacerSonido();   // Hace un sonido de pato
        gallina.hacerSonido(); // Hace un sonido de gallina
    }
}
