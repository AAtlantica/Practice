package Ejercicio1.Correcto;

import java.util.ArrayList;
import java.util.List;

public class PersonajeRepository {
    List<PersonajeEntity> personajeEntityDB = new ArrayList<PersonajeEntity>();

    public  void crearPersonajeEntity(PersonajeDTO personajeDTO){
        PersonajeEntity personajeEntity = new PersonajeEntity();
        personajeEntity.setImagen(personajeDTO.getImagen());
        personajeEntity.setNombre(personajeDTO.getNombre());
        personajeEntity.setEdad(personajeDTO.getEdad());
        personajeEntity.setPeso(personajeDTO.getPeso());
        personajeEntity.setHistoria(personajeDTO.getHistoria());

        personajeEntityDB.add(personajeEntity);
    }
}
