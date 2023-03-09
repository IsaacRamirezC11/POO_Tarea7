public class LibroDriver {
    public static void main(String[] args) {

        Libro book1 = new Libro("Odio Odiar", "Jose Madero Vizcaino", 350);
        Libro book2 = new Libro();

        book2.setTitulo("Pensandolo bien, Pense mal");
        book2.setAutor("Jose Madero Vizcaino");
        book2.setNumerodePaginas(340);

        System.out.println(book1.toString());
        System.out.println(book2.toString());

        book2.leer();
        book1.prestamo();
    }
}
