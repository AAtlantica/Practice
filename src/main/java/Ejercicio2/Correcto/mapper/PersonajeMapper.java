package Ejercicio2.Correcto.mapper;


import Ejercicio2.Correcto.DTO.PersonajeDTO;
import Ejercicio2.Correcto.entities.PersonajeEntity;

public class PersonajeMapper {

    public PersonajeEntity toEntity(PersonajeDTO personajeDTO){
        PersonajeEntity personajeEntity = new PersonajeEntity();
        personajeEntity.setImagen(personajeDTO.getImagen());
        personajeEntity.setNombre(personajeDTO.getNombre());
        personajeEntity.setEdad(personajeDTO.getEdad());
        personajeEntity.setPeso(personajeDTO.getPeso());
        personajeEntity.setHistoria(personajeDTO.getHistoria());
        personajeEntity.setPeliculaEntity(
                toEntity(personajeDTO.getPeliculaDTO()).getPeliculaEntity()
        );
        return personajeEntity;
    }
}
