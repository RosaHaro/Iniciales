package com.example;

    import java.util.Scanner;

    //TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
        public static void main(String[]args){
            Scanner entrada = new Scanner(System.in);
            System.out.println("Introduce el número: ");
            int numero = entrada.nextInt();
    
            for(int i=1; i<= numero; i++){
                if (i%5==0)
                    System.out.println(i);
            }
            int i = 0;
            while (i++<=100) {
                System.out.print(i);
                if (i%5 ==0){
                    System.out.println(" Es múltiplo de 5.");
                }
    
            }
        }
    }