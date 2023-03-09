public class BalonDriver {
    public static void main(String[] args) {
        Balon b1 = new Balon("Wilson","Rojo",45);
        Balon b2 = new Balon();
        b2.setMarca("Spalding");
        b2.setColor("Naranja");
        b2.setDiametro(50);

        System.out.println(b2.toString());
        System.out.println(b1.toString());

        b1.inflar();
        b2.desinflar();


    }
}
