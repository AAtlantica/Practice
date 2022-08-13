package Ejercicio2.Correcto;

import Ejercicio2.Incorrecto.PeliculaEntity;

public class PersonajeEntity {
    private String imagen;
    private String nombre;
    private Integer edad;
    private Double peso;
    private String historia;

    private PeliculaEntity peliculaEntity;


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public PeliculaEntity getPeliculaEntity() {
        return peliculaEntity;
    }

    public void setPeliculaEntity(PeliculaEntity peliculaEntity) {
        this.peliculaEntity = peliculaEntity;
    }

    @Override
    public String toString() {
        return "PersonajeDTO{" +
                "imagen='" + imagen + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", historia='" + historia + '\'' +
                '}';
    }
}
