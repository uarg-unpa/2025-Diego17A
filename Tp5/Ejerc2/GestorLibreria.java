package Tp5.Ejerc2;

public class GestorLibreria {
    
    private Libro[] libros;
    private int cantidad;

    public GestorLibreria(int capacidad) {
        libros = new Libro[capacidad];
        cantidad = 0;
    }
    
    public void agregarLibro(String titulo, String autor) {// Agregar libro a la librería
        if (cantidad >= libros.length) {
            System.out.println("No hay más espacio para libros.");
            return;
        }
        libros[cantidad] = new Libro(titulo, autor);
        cantidad++;
    }   
    public void prestarLibro(String titulo) { // Prestar un libro por título
        Libro libro = buscarLibro(titulo);

        if (libro == null) {
            System.out.println("El libro no existe.");
            return;
        }

        if (libro.isPrestado()) {
            System.out.println("El libro ya ha sido prestado.");
        } else {
            libro.prestar();
            System.out.println("El libro '" + titulo + "' ha sido prestado.");
        }
    }
    public void devolverLibro(String titulo) { // Devolver libro
        Libro libro = buscarLibro(titulo);

        if (libro == null) {
            System.out.println("El libro no existe.");
            return;
        }

        if (!libro.isPrestado()) {
            System.out.println("El libro no está prestado.");
        } else {
            libro.devolver();
            System.out.println("El libro '" + titulo + "' ha sido devuelto.");
        }
    }
    private Libro buscarLibro(String titulo) {// Buscar libro por título
        for (int i = 0; i < cantidad; i++) {
            if (libros[i].getTitulo().equalsIgnoreCase(titulo)) {
                return libros[i];
            }
        }
        return null;
    }
    public void listarDisponibles() {// Listar solo libros disponibles
        System.out.println("\nLibros disponibles:");
        boolean hay = false;

        for (int i = 0; i < cantidad; i++) {
            if (!libros[i].isPrestado()) {
                System.out.println("- " + libros[i]);
                hay = true;
            }
        }
        if (!hay) {
            System.out.println("No hay libros disponibles.");
        }
    }
}
