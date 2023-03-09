public class Giroscopio {
    private String tipo;
    private double resolucion;
    private boolean activado;

    public Giroscopio() {
        this.tipo = "Desconocido";
        this.resolucion = 0.0;
        this.activado = false;
    }

    public Giroscopio(String tipo, double resolucion) {
        this.tipo = tipo;
        this.resolucion = resolucion;
        this.activado = false;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isActivado() {
        return activado;
    }

    public String toString() {
        String estado = activado ? "encendido" : "apagado";
        return tipo + " (resolución: " + resolucion + ", estado: " + estado + ")";
    }

    public void encender() {
        System.out.println("Encendiendo el giroscopio " + tipo);
        activado = true;
    }

    public void apagar() {
        System.out.println("Apagando el giroscopio " + tipo);
        activado = false;
    }

    public double obtenerAngulo() {

        return 0.0;
    }
}
