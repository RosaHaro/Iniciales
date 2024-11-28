package poo.Aemet2;
import java.util.Scanner;
public class aemet2 {
    public static final int NCIUDADES = 3;
    private static String[] ciudades = { "Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla"};
    private static String[] dias = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo" };

    public static Scanner entrada = new Scanner(System.in); 
    public static RegCiudad[] registroTemp = new RegCiudad[NCIUDADES] ;

    public static void main (String[] args){
        Aemet2.GenerarRegitroTemp();
       
    }

    public static void GenerarRegitroTemp(){
    
        RegCiudad2 ciudad = new RegCiudad2("Almeria");

     }


   

}