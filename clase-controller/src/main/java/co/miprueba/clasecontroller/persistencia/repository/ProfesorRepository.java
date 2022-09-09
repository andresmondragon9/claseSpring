package co.miprueba.clasecontroller.persistencia.repository;

import co.miprueba.clasecontroller.persistencia.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor,Integer> {
}
