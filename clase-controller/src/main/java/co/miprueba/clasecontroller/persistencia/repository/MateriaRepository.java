package co.miprueba.clasecontroller.persistencia.repository;

import co.miprueba.clasecontroller.persistencia.entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Integer> {
}
