package bucles;
import java.util.Scanner;
public class Prueba1 {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[]args)throws Exception{
        System.out.println("Ejercicios de bucles");
        Prueba1.mostrar10();
        Prueba1.mostrarN();
        Prueba1.sumarN();
        Prueba1.factorialN();

        }
        public static void mostrar10(){
          for (int i =1; i < 11; i++){
            System.out.println("i= " + i);
            }   
        }
        public static void mostrarN(){
            //mostrar los N primeros números
            System.out.println("Introduce el valor de n: ");
            int n = Prueba1.entrada.nextInt();
            for (int i=0; i<n; i++) {
                System.out.print(i + "-");
            }
        }
        public static int sumarN(){
            System.out.println("Introduce el valor de n: ");
            int n = Prueba1.entrada.nextInt();
            int suma = 0;
            for (int i=1;i<=n; i++){
             suma = suma + i;
            }
            System.out.println("La suma es: " + suma);
            return suma;
        }
        public static void factorialN(){
            System.out.println("Introduce el factorial de n: ");
            long factorial = 1;
            for (int i=1;i<=n; i++){
             factorial = factorial * i;
            }
            return factorial;
        }
}
