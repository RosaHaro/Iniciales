import java.util.Scanner;

public class Lectura {
    //Lectura es una clase estática

    public static void main(String[] args)throws Exception {
    //en la var. cadena almacena la lectura
    //flujo de datos se llama entrada
        Scanner entrada = new Scanner (System.in); 
        System.out.println("Introduce tu nombre");
        String nombre = entrada.nextLine();

        System.out.println("Introduce tus apellidos:");
        String apellidos = entrada.nextLine();
        System.out.println("Introduce tu edad:");
        int edad = Integer.parseInt(entrada.nextLine());
    System.out.println("Introduce tu ciudad:");
    String ciudad = entrada.nextLine();
    System.out.println("Tu ciudad es " + ciudad);
    System.out.println("Introduce tu provincia:");
    String provincia = entrada.nextLine();
System.out.println("Te llamas " + nombre + " " + apellidos + " " + "tienes" + " " + edad + " años" + " y tu provincia es" + " " + provincia);
//llamar o invocar al método estático esMayor()
//esMayor(edad);
Lectura.esMayor(edad);
Lectura.getAnioNac(edad);
    }

    public static void esMayor (int edad){
    //método estático de la clase Lectura para saber si es o no mayor de edad
    //Todos los métodos y propiedades estáticas llevan el prefijo static y no se pueden crear objetos
if(edad >= 18){
        System.out.println("Con la edad de " + edad + " años eres Mayor de edad");
    }else {
System.out.println("Con la edad de " + " " + edad + "años eres Menor de edad");
    }
}
public static void getAnioNac(int edad){
int anio = 2024 - edad;
System.err.println("Naciste en el año " + anio);
}
}


