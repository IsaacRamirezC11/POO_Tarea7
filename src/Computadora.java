public class Computadora {
    private String marca;
    private String modelo;
    private int ram;
    private String estado;

    public Computadora() {
        marca = "";
        modelo = "";
        ram = 0;
        estado = "";
    }

    public Computadora(String marca, String modelo, int ram, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.estado = estado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ram=" + ram +
                ", estado='" + estado + '\'' +
                '}';
    }
    public void encender(){
        estado = "Encendida...";
        System.out.println(" El pc se esta encendiendo\n Estado del pc: " + estado);
    }
    public void apagar(){
        estado = "Apagada...";
        System.out.println(" El pc se apago\n Estado del pc: " + estado);
    }
    public void PantallaAzul(){
        estado = "loading....";
        System.out.println("El pc dio un pantallazo\n Estado del pc: " + estado);
    }
}
