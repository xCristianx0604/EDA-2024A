package lab03.ejercicio3;

public class Ganzo extends Ave {

    // Constructor
    public Ganzo(String especie) {
        super(especie);
    }

    // Implementación del método abstracto hacerSonido para Ganzo
    @Override
    public void hacerSonido() {
        System.out.println("¡Hace un sonido de "+getEspecie()+"!");
    }
}

