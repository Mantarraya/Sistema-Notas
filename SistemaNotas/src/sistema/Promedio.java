package sistema;

public class Promedio {

    private String codigo;
    private String nombre;
    private String apellido;
    private double promedio;

    public Promedio(String codigo, String nombre, String apellido, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.promedio = promedio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

}
