public class Mago extends Personaje {
   
    private String elemento;

   
    public Mago(String nombre, int nivel, String elemento) {
        super(nombre, nivel);
        this.elemento = elemento;
    }

   
    @Override
    public void mostrarInfo() {
        System.out.println("Mago [Nivel: " + nivel + ", Elemento: " + elemento + "]");
    }

   
    public void ataqueElemental() {
        System.out.println(nombre + " lanza un hechizo de " + elemento);
        gastarEnergia(25);
    }
}