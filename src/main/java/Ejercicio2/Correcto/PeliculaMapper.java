package Ejercicio2.Correcto;

import Ejercicio2.Incorrecto.PeliculaDTO;
import Ejercicio2.Incorrecto.PeliculaEntity;

public class PeliculaMapper {
    public Ejercicio2.Incorrecto.PeliculaEntity toEntity(PeliculaDTO peliculaDTO){
        Ejercicio2.Incorrecto.PeliculaEntity peliculaEntity = new PeliculaEntity();
        peliculaEntity.setImagen(peliculaDTO.getImagen());
        peliculaEntity.setTitulo(peliculaDTO.getTitulo());
        peliculaEntity.setCalificacion(peliculaDTO.getCalificacion());
        peliculaEntity.setFechaCreacion(peliculaDTO.getFechaCreacion());

        return peliculaEntity;
    }
}
