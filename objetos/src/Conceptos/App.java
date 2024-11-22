//clase principal de un proyecto java, por convenio
public class App {

    int valor=10;
    //Una clase contiene propiedades y métodos
//propiedades --> variables de una clase
//métodos --> funciones de la clase
/* método o función main () y es el punto de entrada a nuestro
 proyecto. En el método main comienza la ejecución de la clase*/
    public static void main(String[] args) throws Exception {
        //creación de variables dentro de un método
        int valor = 5;
        double comision = 15.5;
        String nombre = "Rosa";
        String apellidos = "Haro"; //Clase String de Java -->métodos
        String ciudad = "Garrucha";
        // string ciudad = "Almeria"; //tipo básico cadena de caracteres no es clase no tiene métodos
        String nombreCompleto = nombre +""+ apellidos;
        nombreCompleto.concat(nombre).concat(" ").concat(apellidos); 
        System.out.println(nombreCompleto.length());
        System.out.println(("Vives en ").concat(ciudad));
        System.out.println("Nombre "+ nombreCompleto);

        System.out.printf(("Vives en ").concat(ciudad)+ "\n");
        System.out.printf("Nombre ="+ nombreCompleto);

        // System.out.printf("El valor de la comisión es del %.5f euros%n", comision);
        // System.out.printf("El valor de la comisión es del %10.5f euros%n", comision);
        // System.out.printf("El valor de la comisión es del %-10.5f euros%n", comision);
        // System.out.printf ("%20s %10s %10s%n", "Producto", "Cantidad", "Precio");
        // System.out.printf ("%20s %10d 10.2%f", "Portatil", 10, 1300.45);
        //System.out.printf(, "Ipad 13Pro", 4, 2400);
        
    }


private void calcularPeso(){

}
// private double calcularPotencia(){

// }


//mensaje de bienvenida por la pantalla
        // System.out.println("Bienvenido a mi primer contacto con Java");
        // System.out.println("\033[032 Me llamo Rosa y voy a ser una gran PROGRAMADORA]");
    }

