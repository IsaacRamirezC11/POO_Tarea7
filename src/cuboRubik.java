import java.util.Arrays;

public class cuboRubik {
    private String marca;
    private int tamanio;
    private String[] caras;

    public cuboRubik() {
        this.marca = "";
        this.tamanio = 0;
        this.caras = new String[]{"blanco", "rojo", "azul", "naranja", "verde", "amarillo"};
    }

    public cuboRubik(String marca, int tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.caras = new String[]{"blanco", "rojo", "azul", "naranja", "verde", "amarillo"};
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamano) {
        this.tamanio = tamano;
    }

    public String[] getCaras() {
        return caras;


    }

    @Override
    public String toString() {
        return "cuboRubik{" +
                "marca='" + marca + '\'' +
                ", tamanio=" + tamanio +
                ", caras=" + Arrays.toString(caras) +
                '}';
    }

    public void mezclar() {
        System.out.println("Mezclando el cubo Rubik de " + marca);

    }

    public boolean estaResuelto() {
        System.out.println("false");
        return false;
    }
}


