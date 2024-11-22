public class AleatoriosEjercicios {
public static void main(String[]args) {
    //AleatoriosEjercicios.Ejercicio2();
    //AleatoriosEjercicios.Ejercicio5();
    //AleatoriosEjercicios.Ejercicio6();
    //AleatoriosEjercicios.Ejercicio9();
    //AleatoriosEjercicios.Ejercicio11();
    AleatoriosEjercicios.Ejercicio7();
}
     public static void Ejercicio7(){
        int aleatorio = 0;
        for (int i = 1; i <= 30; i+=2) { 
        //i=1 se inicializa 1 vez,30/2=pleno al 15
        aleatorio =(int)(Math.random()*3); //las 3 apuestas que obtenemos
        //casting para pasar el random que es double a entero
        if(aleatorio ==0){ //El 0 equivale a empate, se cambia por impresión por la X
            System.out.println("Equipo " + i +" vs Equipo "+(i+1)+ ": "+ "X");
        }else{
            System.out.println("Equipo " + i +" vs Equipo "+(i+1)+ ": "+ aleatorio);
            //i+1 para que cuente un nº más de la primera i
        }
        }
        
//     public static void Ejercicio2(){
//         String cartaMax = "a";
//         String cartaMin = "a";
//         for (int i = 0; i < 10; i++){
//         String palo ="";
//         String carta = "";
//         int numeroPalo= (int) (Math.random()*4) + 1;
//         switch (numeroPalo){
//             case 1:
//                 palo = "picas";
//                 break;
//             case 2:
//                 palo = "corazones";
//                 break;
//             case 3:
//                 palo = "diamantes";
//                 break;
//             case 4:
//                 palo ="tréboles";
//             default:
//         }
//         int numeroCarta = (int) (Math.random()*13) + 1;
//         switch (numeroCarta){
//             case 1:
//                 carta = "As";
//                 break;
//             case 11:
//                 carta = "J";
//                 break;
//             case 12:
//                 carta = "Q";
//                 break;
//             case 13:
//                 carta = "K";
//                 break;
//             default:
//                 carta =String.valueOf(numeroCarta);   
//         }
//         System.out.println(carta + " de " + palo);
//         if(1==0){
//             cartaMax = cartaActual;
//             cartaMin =cartaActual;
//             cartaMasAlta = numeroCarta;
//             cartaMasBaja = numeroCarta;
//         }
//         if (numeroCarta > cartaMasAlta){
//             cartaMasAlta = numeroCarta;
//             cartaMax = cartaActual;
//         }
//        }
//     }
//         public static void Ejercicio5(){
//             int numero = 0;
//             int maximo =0;
//             int minimo = 0;
//             double media =0;
            
//                 for (int i = 0; i < 50; i++) {
//                     numero = (int)(Math.random()*100)+100;
//                     if (1==0){
//                         maximo = numero;
//                         minimo = numero;
//                     }
//                     if (numero < minimo) {
//                     minimo = numero;
//                     }
//                     if (numero > maximo) {
//                     maximo = numero;
//                     }
//                     media = media+numero;
//                 }
//                 System.out.print(numero + " ");
                
//             media = media / 50;
//             System.out.println("El máximo es " +maximo);
//             System.out.println("El mínimo es " +minimo);
//             System.out.println("La media es: " + media);    
//             }
// public static void Ejercicio6(){

//     int oportunidades = 5;
//     int numeroIntroducido;
//     boolean acertado = false;
//     int numeroMisterioso = (int)(Math.random() * 101);
//     System.out.println("Intenta adivinar un número del 0 al 100. Tienes 5 oportunidades.");
//     do{
//     System.out.print("Introduce un número: ");
//     numeroIntroducido = Integer.parseInt(System.console().readLine());
//     oportunidades--;
//     if ( (numeroIntroducido > numeroMisterioso) && (oportunidades > 0) ){
//     System.out.println("El número que estoy pensando es menor que " + numeroIntroducido);
//     System.out.println("Te quedan " + oportunidades + " oportunidades.");
//     }
//     if ( (numeroIntroducido < numeroMisterioso) && (oportunidades > 0) ){
//     System.out.println("El número que estoy pensando es mayor que " + numeroIntroducido);
//     System.out.println("Te quedan " + oportunidades + " oportunidades.");
//     }
//     if (numeroIntroducido == numeroMisterioso) {
//     acertado = true;
//     System.out.println("¡Enhorabuena! ¡has acertado!");
//     }
//     }while (!acertado && (oportunidades > 0));
//     if (!acertado) {
//     System.out.println("Lo siento, no has acertado, el número que estaba pensando era el " + numeroMisterioso);
//         }
//     }
//     public static void Ejercicio9(){
// iniciamos el contador y los numeros
//     int contar =0;
//     int num = 0;
//     int i =0;
//     while(num!= 24) {
//         num = (int)(Math.random()*30)+1;
//         if(num %2 == 0){
//             System.out.print(num+ " ");
//         }else{
//             // num++;
//             // System.out.print(num+ " ");
//         }
//          //incrementamos 2 para que siga siendo por
//        contar++;
//        i++;
//     }
//     System.out.println("Se ha generado " +contar+ " números");

    
//     }
    // public static void Ejercicio11(){
    //         int suspensos = 0;
    //         int suficientes = 0;
    //         int bien = 0;
    //         int notables = 0;
    //         int sobresalientes = 0;
    //         int mhonor = 0;
    //         double nota = 0;
    //         for(int i = 0; i < 20; i++) {
    //         nota = (int)(Math.random() * 10);
    //         nota =Math.round(nota*100.00)/100.00;
    //         System.out.print(nota +" ");
    //         if(nota < 5){
    //         suspensos++;
    //         }else if ((nota >= 5) && (nota < 6)){
    //             suficientes++;
    //         }else if((nota >= 6) && (nota < 7)){
    //             bien++;
    //         }else if ((nota >= 7) &&(nota < 8)){
    //             notables++;
    //         }else if((nota >= 8) && (nota < 9)){
    //             sobresalientes++;
    //         }else if ((nota >=9) && (nota < 10)){
    //             mhonor++;
    //         }
    // }
    // System.out.println("");
    // System.out.println("Suspensos: " + suspensos);
    // System.out.println("Aprobados: " + suficientes);
    // System.out.println("Bien: " + bien);
    // System.out.println("Notables: " + notables);
    // System.out.println("Sobresalientes: " + sobresalientes);
    // }
    }
}



