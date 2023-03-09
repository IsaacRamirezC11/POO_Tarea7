public class PaisDriver {

    public static void main(String[] args) {
    Pais p1 = new Pais("Espania","Madrid",47615034,"Espaniol");
    Pais p2 = new Pais("Irlanda", "Dublin", 5123536, "Irlandes");
    p2.setNombre("Irlanda");
    p2.setCapital("Dublin");
    p2.setPoblacion(5123536);
    p2.setIdioma("Irlandes");

        System.out.println(p1.toString());
        System.out.println(p2.toString());

    p2.emigracion();
    p1.visitantes();



    }
}
