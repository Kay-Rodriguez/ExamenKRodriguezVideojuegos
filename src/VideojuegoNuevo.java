public class VideojuegoActual extends Videojuegos {
    String genero;
    

    public void mostrarInfo() {
        System.out.println("Nombre del videojuego: " + nombre);
        System.out.println("Género: " + genero);
        System.out.println("Año de lanzamiento: " + anioLanzamiento);
    }
}
}
