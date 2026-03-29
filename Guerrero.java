public class Guerrero extends Personaje {
    
    private String arma;

    
    public Guerrero(String nombre, int nivel, String arma) {
        super(nombre, nivel);
        this.arma = arma;
    }

    
    @Override
    public void mostrarInfo() {
        System.out.println("Guerrero [Nombre: " + nombre + ", Nivel: " + nivel + ", Energía: " + energia + ", Arma: " + arma + "]");
    }

    
    public void ataquePesado() {
        System.out.println(nombre + " realiza un ataque pesado con su " + arma);
        gastarEnergia(15);
    }
}