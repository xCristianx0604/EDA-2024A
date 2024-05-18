package lab03.ejercicio3;

public class Pato extends Ave {

    // Constructor
    public Pato(String especie) {
        super(especie);
    }

    // Implementación del método abstracto hacerSonido para Pato
    @Override
    public void hacerSonido() {
        System.out.println("¡Hace un sonido de "+getEspecie()+"!");
    }
}

