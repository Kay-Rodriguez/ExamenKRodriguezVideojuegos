public class VideojuegoAccion extends VideojuegoAntiguo{


// Clase derivada 2: JuegoDeAventura
class JuegoDeAventura extends JuegoDeAccion {
    private String protagonista;

    // Constructor
    public JuegoDeAventura(String nombre, String genero, int anioLanzamiento, int dificultad, String protagonista) {
        super(nombre, genero, anioLanzamiento, dificultad); // Llamada al constructor de la clase JuegoDeAccion
        this.protagonista = protagonista;
    }

    // Setter y Getter para protagonista
    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    // Sobrescribimos el método mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamada al método de la clase JuegoDeAccion
        System.out.println("Protagonista: " + protagonista);
    }

    // Método personalizado para la aventura
    public void comenzarAventura() {
        System.out.println("¡Comienza la aventura del héroe " + protagonista + "!");
    }
}
// Clase derivada 3: JuegoDeRol
class JuegoDeRol extends JuegoDeAventura {
    private String tipoDeRol;

    // Constructor
    public JuegoDeRol(String nombre, String genero, int anioLanzamiento, int dificultad, String protagonista, String tipoDeRol) {
        super(nombre, genero, anioLanzamiento, dificultad, protagonista); // Llamada al constructor de la clase JuegoDeAventura
        this.tipoDeRol = tipoDeRol;
    }

    // Setter y Getter para tipoDeRol
    public String getTipoDeRol() {
        return tipoDeRol;
    }

    public void setTipoDeRol(String tipoDeRol) {
        this.tipoDeRol = tipoDeRol;
    }

    // Sobrescribimos el método mostrarInfo
    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Llamada al método de la clase JuegoDeAventura
        System.out.println("Tipo de rol: " + tipoDeRol);
    }

    // Método personalizado para describir el rol
    public void jugarRol() {
        System.out.println("Te has convertido en un " + tipoDeRol + " dentro del mundo de " + getNombre() + "!");
    }
}

