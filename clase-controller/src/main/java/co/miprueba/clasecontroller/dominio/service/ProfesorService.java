package co.miprueba.clasecontroller.dominio.service;

import co.miprueba.clasecontroller.dominio.dto.MateriaDTO;
import co.miprueba.clasecontroller.dominio.dto.ProfesorDTO;
import io.swagger.models.auth.In;

import java.util.List;

public interface ProfesorService {

    // calcularNota();
    List<MateriaDTO> listarMateriasByProfesor(Integer idProfesor);

    ProfesorDTO obtenerProfresor(Integer idProfesor);
}
