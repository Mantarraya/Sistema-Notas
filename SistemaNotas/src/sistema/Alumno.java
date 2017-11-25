package sistema;

public class Alumno {
    // Atributos
    private String codigo;
    private String nombres;
    private String apellidos;
    
    //Constructor
    public Alumno(String codigo, String nombres, String apellidos) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    // Metodos Getter y Setter
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombres() {
        return nombres;
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
    
}
