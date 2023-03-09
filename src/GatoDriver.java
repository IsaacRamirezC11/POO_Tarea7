public class GatoDriver {
    public static void main(String[] args) {
        Gato Cat = new Gato("Wilson", "Bengali");

        System.out.println(Cat.getNombre());
        System.out.println(Cat.getEspecie());
        System.out.println(Cat.comer());
        System.out.println(Cat.dormir());
        System.out.println(Cat.araniar());
    }
}
