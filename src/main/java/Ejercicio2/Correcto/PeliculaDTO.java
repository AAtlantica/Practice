package Ejercicio2.Correcto;

public class PeliculaDTO {
    private String imagen;
    private String titulo;
    private Integer calificacion;
    private String fechaCreacion;

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(Integer calificacion) {
        this.calificacion = calificacion;
    }

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    @Override
    public String toString() {
        return "PeliculaDTO{" +
                "imagen='" + imagen + '\'' +
                ", titulo='" + titulo + '\'' +
                ", calificacion=" + calificacion +
                ", fechaCreacion='" + fechaCreacion + '\'' +
                '}';
    }
}
