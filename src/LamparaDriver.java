public class LamparaDriver {

    public static void main(String[] args) {
        Lampara lamp = new Lampara("Phillips",45);
        Lampara lamp2 = new Lampara();
        lamp2.setMarca("ABUS");
        lamp2.setWatts(25);
        System.out.println(lamp.toString());
        System.out.println(lamp2);

        lamp.aumentarWatts(15);
        lamp2.disminuirWatts(20);
    }
}
