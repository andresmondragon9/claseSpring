package co.miprueba.clasecontroller.persistencia.repository;

import co.miprueba.clasecontroller.persistencia.entity.MateriaAlumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoMateriaRepository extends JpaRepository<MateriaAlumno,Integer> {
}
