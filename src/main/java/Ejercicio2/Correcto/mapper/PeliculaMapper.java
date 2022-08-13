package Ejercicio2.Correcto.mapper;

import Ejercicio2.Correcto.DTO.PeliculaDTO;
import Ejercicio2.Correcto.entities.PeliculaEntity;

public class PeliculaMapper {
    public PeliculaEntity toEntity(PeliculaDTO peliculaDTO){
        PeliculaEntity peliculaEntity = new PeliculaEntity();
        peliculaEntity.setImagen(peliculaDTO.getImagen());
        peliculaEntity.setTitulo(peliculaDTO.getTitulo());
        peliculaEntity.setCalificacion(peliculaDTO.getCalificacion());
        peliculaEntity.setFechaCreacion(peliculaDTO.getFechaCreacion());

        return peliculaEntity;
    }
}
