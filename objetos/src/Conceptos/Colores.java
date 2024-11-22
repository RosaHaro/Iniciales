//clase principal de un proyecto java, por convenio
public class Colores {

    int valor = 10;
    //Una clase contiene propiedades y métodos
//propiedades --> variables de una clase
//métodos --> funciones de la clase
/* método o función main () y es el punto de entrada a nuestro
 proyecto. En el método main comienza la ejecución de la clase*/
    public static void main(String[] args) throws Exception {
        //creación de variables dentro de un método
        int valor = 5;
        double comision = 15.5f;
        System.out.printf("El valor de la comisión es del %.5f euros", comision);

//mensaje de bienvenida por la pantalla
        System.out.println("Bienvenido a mi primer contacto con Java");
        System.out.println("\033[032mMe llamo Rosa y voy a ser una gran PROGRAMADORA");
    }

} 

