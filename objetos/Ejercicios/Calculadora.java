import java.util.Scanner;
public class Calculadora {
    public static Scanner entrada = new Scanner(System.in);
    public static void main(String[]args) throws Exception {
        //Calculadora.pruebas1();
       //Calculadora.aleatorios();
        //Calculadora.maxminNotas();   
        Calculadora.maxminTemperaturas();
    }
    public static void maxminTemperaturas(){
        double temp = 0;
        double maximo = 0;//supongo que es un 0
        double minimo = 0;//supongo que es 10
        for (int i = 0; i < 10; i++) {
            temp = Math.random()*10;
            temp = Math.round(temp*100.00)/100.00;
            System.out.print(temp + " - ");
            
            if(i == 0){ //ya no hay incertidumbre en la suposición
                maximo = temp;
                minimo = temp;
            }else{
                if(temp > maximo){
                maximo = temp;
            }
            if(temp < minimo){
                minimo = temp;
            }
    }
}
System.out.println();
System.out.println("Temp máxima= " + maximo);
System.out.println("Temp mínima= " + minimo);
}
        
            // public static void maxminNotas(){
            //     double nota = 0;
            //     double maximo = 0;//supongo que es un 0
            //     double minimo = 10;
            //     for (int i = 0; i < 10; i++) {
            //         nota = Math.random()*10;
            //         nota = Math.round(nota*100.00)/100.00;
            //         System.out.print(nota + " - ");
            //         if(nota > maximo){
            //             maximo = nota;
            //         }
            //         if(nota<minimo){
            //         minimo = nota;
            //     }
            // }
            //     System.out.println();
            //     System.out.println("Nota máxima= " + maximo);
            //     System.out.println("Nota mínima= " + minimo);
         
       
    // public static void maxminNotas(){
    //     double nota = 0;
    //     double maximo = 0;//supongo que es un 0
    //     double minimo = 10;
    //     for (int i = 0; i < 10; i++) {
    //         nota = Math.random()*10;
    //         nota = Math.round(nota*100.00)/100.00;
    //         System.out.print(nota + " - ");
    //         if(nota > maximo){
    //             maximo = nota;
    //         }
    //         if(nota<minimo){
    //         minimo = nota;
    //     }
    // }
    //     System.out.println();
    //     System.out.println("Nota máxima= " + maximo);
    //     System.out.println("Nota mínima= " + minimo);
    public static void aleatorios(){
        double numero = 0;
        for (int i = 0; i < 5; i++) {
            //números entre 0 y 6
            //numero = Math.random()*6;
            //numero = Math.random()*6 + 1; //entre 1 y 6
            //numero = Math.random()*7; //entre 0 y 6
            //30 y 90
            //numero = Math.random()*60 + 1; //entre 1 y 60.9999
            //System.out.print(numero + " -> ");
            //System.out.println(Math.round(numero) + " - ");
            //System.out.print((int)numero + 30); //1...60+30-->60...90
            //System.out.println();
            //60 y 90
            //numero = Math.random()*30 + 1; //entre 1 y 30.9999
            //System.out.print((int)numero + 60); //1...60+30-->60...90
            //System.out.println();
            //double nota = Math.random()*10;
            //System.out.println("nota= " + Math.round(nota*10.0)/10.0);
            //si quiero un decimal->10.0-->5.6
            //si quiero 2 decimales->100.00-->5.57
        }
    }
    // public static void pruebas1(){
    //     //Metodos trigonometricos--> la clase Math
    //     double valor = Math.sin(90);
    //    // System.out.println(valor);
    //     //System.out.println(Math.toRadians(valor));
    //     //System.out.println(Math.sqrt(16)); //calcula la raiz cuadrada
    //     //System.out.println(Math.pow(3, 2)); //calcula la potencia
    //     //System.out.println(Math.abs(-10)); //devuelve su positivo
    //     //System.out.println(Math.round(10.6)); //redondea
    //     System.out.println(Math.max(a:23 ,b:42));
    // }
}
