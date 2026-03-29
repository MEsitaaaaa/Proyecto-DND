public class Personaje {
    
    protected String nombre;
    protected int nivel;
    protected int energia;
    
   
    public static int totalPersonajes = 0;

   
    public Personaje(String nombre, int nivel) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.energia = 100;
        totalPersonajes++; // 
    }

   
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public int getNivel() { return nivel; }
    public void setNivel(int nivel) { this.nivel = nivel; }
    public int getEnergia() { return energia; }
    public void setEnergia(int energia) { this.energia = energia; }


    public void entrenar(int x) {
        if (x > 0) {
            this.nivel += x;
        }
    }

   
    public void descansar(int x) {
        if (x > 0) {
            if (this.energia + x > 100) {
                this.energia = 100;
            } else {
                this.energia += x;
            }
        }
    }


    public void gastarEnergia(int x) {
        if (this.energia - x < 0) {
            this.energia = 0;
        } else {
            this.energia -= x;
        }
    }

   
    public void mostrarInfo() {
        System.out.println("Personaje [Nombre: " + nombre + ", Nivel: " + nivel + ", Energía: " + energia + "]");
    }

   
    public static void mostrarTotalPersonajes() {
        System.out.println("Total de personajes creados: " + totalPersonajes);
    }
}