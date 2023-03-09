public class cuboRubikDriver {
    public static void main(String[] args){

        cuboRubik cub = new cuboRubik("Qiyi",3);
        System.out.println(cub.toString());

        cub.mezclar();
        cub.estaResuelto();

    }
}
