package Ejercicio2;

public class PersonajeMapper {

    public PersonajeEntity toEntity(PersonajeDTO personajeDTO){
        PersonajeEntity personajeEntity = new PersonajeEntity();
        personajeEntity.setImagen(personajeDTO.getImagen());
        personajeEntity.setNombre(personajeDTO.getNombre());
        personajeEntity.setEdad(personajeDTO.getEdad());
        personajeEntity.setPeso(personajeDTO.getPeso());
        personajeEntity.setHistoria(personajeDTO.getHistoria());
        personajeEntity.setPeliculaEntity(
                toEntity(personajeDTO.getPeliculaDTO())
        );
        return personajeEntity;
    }

    public PeliculaEntity toEntity(PeliculaDTO peliculaDTO){
        PeliculaEntity peliculaEntity = new PeliculaEntity();
        peliculaEntity.setImagen(peliculaDTO.getImagen());
        peliculaEntity.setTitulo(peliculaDTO.getTitulo());
        peliculaEntity.setCalificacion(peliculaDTO.getCalificacion());
        peliculaEntity.setFechaCreacion(peliculaDTO.getFechaCreacion());

        return peliculaEntity;
    }


}
