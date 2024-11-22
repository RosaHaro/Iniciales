import java.util.Scanner;
public class Numeros {
public static void main(String[]args){
    Scanner datos = new Scanner(System.in);
    System.out.println("Introduce la base: ");
    int base = datos.nextInt();
    System.out.println("Introduce el exponente: ");
    int exponente =datos.nextInt();
    int total = base * exponente;
    System.out.println(base);
    for (int i=1;i < exponente;i++){
       total = exponente * base;
       if (exponente<=1){
        System.out.println(total);
    }
    }

}
}