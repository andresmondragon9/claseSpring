package co.miprueba.clasecontroller.dominio.dto;

public class PersonaDTO {

    private Integer id;
    private String nombres;
    private String apellidos;
    private Integer edad;

    public String getNombres() {
        return nombres;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
