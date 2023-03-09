public class Balon {

    private String marca;
    private String color;
    private double diametro;

    public Balon() {

        marca = "";
        color = "";
        diametro = 0;
    }

    public Balon(String marca, String color, double diametro) {
        this.marca = marca;
        this.color = color;
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String toString() {
        return "Balon{" +
                "marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", diametro=" + diametro +
                '}';
    }

    public void desinflar(){
        System.out.println("El balón ha sido desinflado");

    }
    public void inflar(){
        System.out.println("El balón ha sido inflado");
    }
}