package co.miprueba.clasecontroller.dominio.dto;

import lombok.Data;

import java.util.List;
@Data
public class ProfesorDTO extends PersonaDTO{

  private Integer idProfsor;
  private List<MateriaDTO> materiaDTOS;
  private String faculta;

}
