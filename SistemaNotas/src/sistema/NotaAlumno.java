package sistema;


public class NotaAlumno {

    // Atributos
    private String codigo;
    private String nombres;
    private String apellidos;
    private int notaControl;
    private int notaLaboratorio;
    private int notaProyecto;
    private int notaExamenParcial;
    private int notaExamenFinal;

    public NotaAlumno(String codigo, String nombres, String apellidos, int notaControl, int notaLaboratorio, int notaProyecto, int notaExamenParcial, int notaExamenFinal) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.notaControl = notaControl;
        this.notaLaboratorio = notaLaboratorio;
        this.notaProyecto = notaProyecto;
        this.notaExamenParcial = notaExamenParcial;
        this.notaExamenFinal = notaExamenFinal;
    }

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

    public int getNotaControl() {
        return notaControl;
    }

    public void setNotaControl(int notaControl) {
        this.notaControl = notaControl;
    }

    public int getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public void setNotaLaboratorio(int notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }

    public int getNotaProyecto() {
        return notaProyecto;
    }

    public void setNotaProyecto(int notaProyecto) {
        this.notaProyecto = notaProyecto;
    }

    public int getNotaExamenParcial() {
        return notaExamenParcial;
    }

    public void setNotaExamenParcial(int notaExamenParcial) {
        this.notaExamenParcial = notaExamenParcial;
    }

    public int getNotaExamenFinal() {
        return notaExamenFinal;
    }

    public void setNotaExamenFinal(int notaExamenFinal) {
        this.notaExamenFinal = notaExamenFinal;
    }

}
