package lab03.ejercicio3;

public abstract class Ave {
    private String especie;

    // Constructor
    public Ave(String especie) {
        this.especie = especie;
    }
    
    // Método getter
    public String getEspecie(){
        return especie;
    }
    // Método abstracto para hacer sonido
    public abstract void hacerSonido();
}
