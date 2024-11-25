package rhaAemet.rhaExamen; //Guardo la clase regciudad en estas carpetas,clase regciudad
import java.util.Scanner; //importo Scanner para poder introducir texto por teclado
//Comenzamos con la clase regCiudad, no la he completado pero he llegado hasta esto
public class rhaRegCiudad { //la clase
    public static Scanner entrada = new Scanner(System.in);
    public final int rhaNDIAS = 7; //Declaro 7 días para la semana
    public final int rhaNTEM =3; //Declaro que saque 3 temperaturas
    String[] rhadiasSemana = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
    int []rhatemperaturas = new int[3];
    private int rhatemp=0;//no supongo las temperaturas, por eso todas a 0
    private int rhatmax =0;
    private int rhatmin =0;

    //Constructor
    public int rhaRegCiudad (String[]rhadiasSemana, int rhatmax,int rhatmin){
        this.setDia(rhadiasSemana); //setter de dia de la semana
        this.setTmax(rhatmax);//setter de temperatura máxima
        this.setTmin(rhatmin);//setter de temperatura minima
    }
   
    public void rhagenerarTemperaturas(){ //No ejecuta,pero lo he intentado incluyendo el array de ciudad
        //y luego el de temperatura

        for (int i = 0; i < 3; i++) {
            System.out.print("Introduzca la temperatura media de " + rhadiasSemana[i] + ": ");
            rhatemperaturas[i] = Integer.parseInt(System.console().readLine());
            System.out.println();
        }
    }   
            
    public void rhagenerarDatosDia(){
     

    }
    //setters y getters
    public void setDia(String rhadiasSemana){
        this.rhadiasSemana = rhadiasSemana.toUpperCase();
    }
    public void setTmax(int rhatmax){
        this.rhatmax = rhatmax;
    }
    public void setTmin(int rhatmin){
        this.rhatmin = rhatmin;
    }
    public void getDia(){
        return this.rhadiasSemana();
    }
    public void getTmax(){
        return this.rhatmax();
    }
    public void getTmin(){
        return this.rhatmin();
    }


}
//Y ahora vamos con la clase Aemet


    
