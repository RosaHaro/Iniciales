package poo.biblioteca;

public class Autor{
    private final int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String email;
    // Constructor
    public Autor(int id,String nombre, String apellido1, String apellido2, String email) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.email =email;
        this.id =(int) (Math.random() * 1000); 
    }
    // Métodos getter y setter
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }
    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }
    public int getgenerarId() {
        return id;
    }
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Método toString para una representación en cadena del objeto
    @Override
    public String toString() {
        return "Autor{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido1 + '\'' +
                ", segundo apellido='" +apellido2+'\''+
                ", email='" + email + '\'' +
                '}';
    }
}




