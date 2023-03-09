public class ComputadoraDriver {
    public static void main(String[] args) {

        Computadora pc = new Computadora("Acer","Nitro 5", 32,"Encendido");
        Computadora pc2 = new Computadora();
        pc2.setMarca("Asus");
        pc2.setModelo("TUF gaming");
        pc2.setRam(8);
        pc2.setEstado("Apagada");

        System.out.println(pc.toString());
        System.out.println(pc2.toString());

        pc.encender();
        pc2.apagar();
        pc2.PantallaAzul();
    }
}
