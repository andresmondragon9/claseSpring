package co.miprueba.clasecontroller.persistencia.repository;

import co.miprueba.clasecontroller.persistencia.entity.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona,Integer> {

    @Query(value = "select * from personas where id = ?" , nativeQuery = true)
    Persona findByIdPersona(Integer idPersona);

    List<Persona> findByEdad(Integer edad);

}
