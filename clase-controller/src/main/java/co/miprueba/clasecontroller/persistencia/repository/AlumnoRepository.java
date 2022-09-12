package co.miprueba.clasecontroller.persistencia.repository;

import co.miprueba.clasecontroller.persistencia.entity.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer> {
}
