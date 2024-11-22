package rhaAemet.rhaExamen;

public class rhaAemet{
    static final int rhaNCIUDADES = 8;
    static String[] rhanombres = {"Almería", "Granada", "Jaén", "Málaga", "Sevilla" , "Cádiz", "Córdoba", "Sevilla" };
    public static rhaAemet[]rha = new rhaAemet[rhaNCIUDADES];
   


    
public static void main (String[]args){
    
    rhaAemet.rhaGenerarRegistroTemp();
    //rhaAemet.rhaListarRegistroTemp();
}
public static void rhaGenerarRegistroTemp(){
 //Es la entrada de datos, se toma cada nombre del array de nombres, se piden valorMax y valorMin y se crea cada RegCiudad

 for (int i=0; i<rhaAemet.rhaNCIUDADES; i++){
    System.out.print("La ciudad " + (i+1) + ": ");
    rhaAemet.rhanombres[i] = rhaAemet.entrada.next();

    }
2
}
public static void rhaListarRegistroTemp(){
//Se muestra el listado de de las ciudades con sus temperaturas semanales 


}

}

   



