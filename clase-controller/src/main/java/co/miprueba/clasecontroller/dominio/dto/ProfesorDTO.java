package co.miprueba.clasecontroller.dominio.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.List;
@Data
public class ProfesorDTO{

  private Integer idProfsor;
  private List<MateriaDTO> materiaDTOS;
  @JsonView(VistaJson.clase.class)
  private String faculta;
  private PersonaDTO personaDTO;

}
