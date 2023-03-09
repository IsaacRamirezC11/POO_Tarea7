public class Libro {
    private String titulo;
    private String autor;
    private int numerodePaginas;

    public Libro() {
        titulo = "";
        autor = "";
        numerodePaginas = 0;
    }

    public Libro(String titulo, String autor, int numerodePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodePaginas = numerodePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerodePaginas() {
        return numerodePaginas;
    }

    public void setNumerodePaginas(int numerodePaginas) {
        this.numerodePaginas = numerodePaginas;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numerodePaginas=" + numerodePaginas +
                '}';
    }

    public void leer(){

        System.out.println("Leyendo:" + titulo);

    }

    public void prestamo(){

        System.out.println("El libro: " + titulo + " del autor: " + autor + " ha sido prestado.");

    }
}
