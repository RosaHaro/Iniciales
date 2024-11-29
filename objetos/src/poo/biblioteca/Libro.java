package poo.biblioteca;
import poo.biblioteca.Autor;
public class Libro {
    private String codigo;
    private String titulo;
    private String autor;
    private int year;
    private boolean prestado;
    Libro.generarCodigoLibro();

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }
    public String getApellido1(){
        return apellido1;
    }
    public void setApellido2(String apellido1) {
        this.apellido2 = apellido2;
    }
    public String getApellido2(){
        return apellido2;
    }
    public void setYear(String apellido1) {
        this.year = year;
    }
    public String getYear(){
        return year;
    }
}
