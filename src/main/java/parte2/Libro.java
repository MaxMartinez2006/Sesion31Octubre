package parte2;

import java.util.ArrayList;
import java.util.List;

class Libro {
    private String titulo;
    private String autor;

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
}

class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() { libros = new ArrayList<>(); }

    public void agregarLibro(Libro libro) { libros.add(libro); }
    public void eliminarLibro(Libro libro) { libros.remove(libro); }
    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println("Título: " + libro.getTitulo() + ", Autor: " + libro.getAutor());
        }
    }
}
