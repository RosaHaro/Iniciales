// import java.util.Scanner;

// public class Persona {
//     //public static: son propiedades a nivel de clase son accesibles a todos
//     //los métodos de esta clase
//     //public static String nombre1;
//     //public static String nombre2;
//     //public static int edad1;
//     //public static int edad2;
//     public static void main (String[]args){
//         //en la var.cadena almacena la lectura por consola-> flujo de datos
// //nombre1,nombre2,edad1 y edad2 se declaran a nivel de método
// //al valor de estas solo se accede en el método main
//         Scanner entrada = new Scanner (System.in); //flujo de datos y sobre el leere todas las variables
// System.out.print("Nombre Persona1");
// String nombre1 = entrada.nextLine();
// System.out.print("Edad de" + nombre1 + ": ");
//         int edad1 = Integer.parseInt(entrada.nextLine());
//         Persona.quienMayor(edad1, nombre1);
//         System.out.print("Nombre Persona2");
//         String nombre2 = entrada.nextLine();
//         System.out.print("Edad de" + nombre2 + ": ");
//                 int edad2 = Integer.parseInt(entrada.nextLine());
//     Persona.quienMayor(edad2, nombre2);
//             }
// public static void quienMayor (int edad1, int edad2, String nombre1, String nombre2){
//     if {edad1 > edad2}{
//         System.err.println(nombre1 + "es mayor que" + nombre2);
//     }else if{edad1 == edad2}{
//         System.out.println(nombre1 + "tiene la misma edad que" + nombre2);
//     }else{
//         System.out.println(nombre2 + "es mayor que" + nombre1);
//     }

// }