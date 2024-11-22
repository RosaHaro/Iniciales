import java.util.Scanner;
public class Bucles {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args)throws Exception {
    //Bucles.ejercicio15();
    //Bucles.ejercicio1();
    //Bucles.ejercicio2();
    Bucles.ejercicio16();
    }
    public static void ejercicio1(){
        System.out.print("el múltiplo de: ");
        int multiplo = Bucles.entrada.nextInt();
        for (int i=0; i<=100;i++){
        if (i % multiplo ==0)
        System.out.print(i + ",");
        }
    }
    public static void ejercicio2(){
        System.out.print("el múltiplo de: ");
        int multiplo = Bucles.entrada.nextInt();
        int i =0;
        while (i<=100){
        if (i % multiplo ==0)
        System.out.print(i + ",");
        i++;
        }    

    }
    public static void ejercicio15(){
        System.out.print("Base: ");
        int base = Bucles.entrada.nextInt();
        System.out.print("Exponente: ");
        int exponente = Bucles.entrada.nextInt();

        for (int i=1; i<=exponente;i++){
            int pot = Bucles.potencia(base, i);
            System.out.print(pot);
            System.out.print(", ");
        }
    }
    public static long potencia (int base, int exp){
        long producto = 1;
        for (int i=1; i<=exp; i++){
            producto = base * producto;
        }
        return producto;
    }
    public static void ejercicio16(){
        System.out.print("Número: ");
        int numero =Bucles.entrada.nextInt();
        if (esPrimo(numero)){
            System.out.println("El número " + numero + "es primo");
        }else{
            System.out.println("El número " + numero + "NO es primo");
        }

    }
    public static boolean esPrimo(int numero){
        //verificar que todos los restos de dividir número
        //entre los valores de (2... número -1) es <> 0
        //verificar que todos los restos son <>(distinto) 0--> para saber si es primo
        int i = 2;
        boolean primo = true; //variable bandera.-->SUPONGO QUE ES PRIMO
        while ((i<=numero-) && (primo));
            if (numero % i != 0){//si un resto es distinto de 0--> es primo
                i++;
            }
           
        if (primo){
            System.out.print("el número " + numero + "es primo");
        }
        return true;
    }

    }
