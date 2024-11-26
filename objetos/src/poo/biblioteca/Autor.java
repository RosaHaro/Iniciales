package poo.biblioteca;
public class Autor{
    private final int id;
    private String nombre1;
    private String apellido1;
    private String apellido2;
    private String email;
    // Constructor
    public Autor(String nombre1, String apellido1, String apellido2, String email) {
        this.nombre1 = nombre1;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.id =(int) (Math.random() * 1000); 
        this.email =email;
    }
    // Métodos getter y setter
    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getApellido1() {
        return apellido1;
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
    public void main(String[] args) {
    Autor autor = new Autor("Juan", "Perez", "Martinez", "juan.perez@example.com");
    System.out.println("Autor: " + autor.getNombre1() + " " + autor.getApellido1() + " (ID: " + autor.id + ")");
    }
}



