package edbeca.simarro.proyectocanciones;

public class Cancion {

    private String nombre;
    private String compositores;
    private Double duracion;

    public Cancion(String nombre, String compositores, Double duracion) {
        this.nombre = nombre;
        this.compositores = compositores;
        this.duracion = duracion;
    }

    public Cancion() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompositores() {
        return compositores;
    }

    public void setCompositores(String compositores) {
        this.compositores = compositores;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return nombre + "," + compositores + "," + duracion;
    }
}
