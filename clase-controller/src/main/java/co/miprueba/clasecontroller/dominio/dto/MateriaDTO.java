package co.miprueba.clasecontroller.dominio.dto;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

@Data
public class MateriaDTO {

    private Integer idMateria;
    @JsonView(VistaJson.clase.class)
    private String nombre;
    @JsonView(VistaJson.clase.class)
    private Integer horas;
    @JsonView(VistaJson.clase.class)
    private Integer creditos;
    private Integer faculta;
}
