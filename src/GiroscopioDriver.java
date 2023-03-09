public class GiroscopioDriver {
    public static void main(String[] args) {
        Giroscopio gir = new Giroscopio("Rotatorio",6);
        Giroscopio gir2 = new Giroscopio();
        gir2.setTipo("Laser");
        gir2.setResolucion(6);

        System.out.println(gir.toString());
        System.out.println(gir2.toString());

        gir.encender();
        gir.obtenerAngulo();
        gir2.apagar();
    }
}
