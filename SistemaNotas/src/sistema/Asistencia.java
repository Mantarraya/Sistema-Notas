package sistema;

public class Asistencia {

    private String codigo;
    private String nombreAlumno;
    private Boolean asistio;

    public Asistencia(String codigo, String nombreAlumno, Boolean asistio) {
        this.codigo = codigo;
        this.nombreAlumno = nombreAlumno;
        this.asistio = asistio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public Boolean getAsistio() {
        return asistio;
    }

    public void setAsistio(Boolean asistio) {
        this.asistio = asistio;
    }

}
