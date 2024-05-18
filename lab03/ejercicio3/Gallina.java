package lab03.ejercicio3;

public class Gallina extends Ave {

    // Constructor
    public Gallina(String especie) {
        super(especie);
    }

    // Implementación del método abstracto hacerSonido para Gallina
    @Override
    public void hacerSonido() {
        System.out.println("¡Hace un sonido de "+getEspecie()+"!");
    }
}

