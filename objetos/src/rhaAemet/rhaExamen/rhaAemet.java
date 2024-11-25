package rhaAemet.rhaExamen;
import java.util.Scanner;
//importo la clase rhagCiudad de la carpeta rhaExamen 
//que está dentro de la carpeta rhaAemet
import rhaAemet.rhaExamen.rhaRegCiudad; //creo que me sale este error por los fallos que
//me suele dar packages

public class rhaAemet{
    public static Scanner entrada = new Scanner(System.in); 
    static final int rhaNCIUDADES = 8; //Declaro la cantidad de ciudades
    //designo los nombres de las ciudades en el array
    static String[] rhanombres = {"Almería", "Granada", "Jaén", "Málaga", "Sevilla", "Cádiz", "Córdoba", "Sevilla" };
    //creo el objeto ciudades con el new
    public static rhaAemet[]rha = new rhaAemet[rhaNCIUDADES];

    
public static void main (String[]args){
    //declaro los métodos en la main
    rhaAemet.rhaGenerarRegistroTemp();
    //rhaAemet.rhaMostrarDatosDia();
    //rhaAemet.rhaListarRegistroTemp();
}
public static void rhaGenerarRegistroTemp(){


 

}
public void rhaMostrarDatosDia(){
    for (int i=0; i<rhaAemet.rhaNCIUDADES; i++){ 
        int rhatemperaturas =Math.random()*3;//que me genere 3 temp aleatorias
        this.rhatemperaturas[i] = Math.round(temp*10.0)/10.0;//temp de 1 décimal
        //Me he bloqueado,no sé cómo seguir en general con los demas metodos
    }
}

public static void rhaListarRegistroTemp(){
//Se muestra el listado de de las ciudades con sus temperaturas semanales 
        }


}


   



