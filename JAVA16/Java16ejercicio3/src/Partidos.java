public class Partidos {
    
    private String nombrePartido;
    private double porcentaje;

    public Partidos() {
    }

    public Partidos(String nombrePartido, double porcentaje) {
        this.nombrePartido = nombrePartido;
        this.porcentaje = porcentaje;
    }

    public String getNombrePartido() {
        return this.nombrePartido;
    }

    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    public double getPorcentaje() {
        return this.porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Nombre partido: " + getNombrePartido() + "; " +
            "Porcentaje: " + getPorcentaje();
    }

}
