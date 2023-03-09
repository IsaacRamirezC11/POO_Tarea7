public class Pais {
    private String nombre;
    private String capital;
    private int poblacion;
    private String idioma;

   public Pais() {
   nombre = "";
   capital = "";
   poblacion = 0;
   idioma = "";

   }
    public Pais(String nombre, String capital, int poblacion, String idioma) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.idioma = idioma;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                ", poblacion=" + poblacion +
                ", idioma='" + idioma + '\'' +
                '}';
    }

    public void emigracion(){
    poblacion -= 45000;
        System.out.println(nombre + " Abandonan el Pais por una mejor situacion\n Ahora su poblacion es de: " + poblacion);

    }

    public void visitantes(){
       poblacion += 1500;
        System.out.println(nombre + " Llegan de vacaciones turistas\n Su poblacion ahora es de: " + poblacion);

    }
        }






