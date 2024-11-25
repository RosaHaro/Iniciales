package poo.Aemet2;
import java.util.Scanner;
public class aemet2 {
    public static final int NCIUDADES = 8;
    private static String[] ciudades = { "Almeria", "Granada", "Cadiz", "Malaga", "Jaen", "Cordoba", "Huelva", "Sevilla"};
   
    public static Scanner entrada = new Scanner(System.in); 
    
    public static regCiudad2[] regTemperaturas = new regCiudad2[NCIUDADES];
 

    public static void main (String[] args){
      aemet2.GenerarRegitroTemp();
      aemet2.ListarRegistroTemperaturas();
    }

    public static void GenerarRegitroTemp(){
        int vmax; int vmin;
        for (int i = 0; i<NCIUDADES; i++){
            System.out.println(ciudades[i] + ": ");
            System.out.print("  Vmax: ");
            vmax = aemet2.entrada.nextInt();
            System.out.print("  Vmin: ");
            vmin = aemet2.entrada.nextInt();
            aemet2.regTemperaturas[i] = new regCiudad2(ciudades[i], vmin, vmax);

        }
    }
    public static void ListarRegistroTemperaturas(){
        for (int i=0; i<NCIUDADES; i++){
            aemet2.regTemperaturas[i].mostrarTabla();
        }
    }

    
}
