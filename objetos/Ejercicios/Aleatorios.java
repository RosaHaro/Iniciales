public class Aleatorios{ 
    //ejercicios 6.3 de numeros aleatorios
    public static void main(String[] args) {
    //Aleatorios.Ejercicio5();
    Aleatorios.Ejercicio2();
    //Aleatorios.Ejercicio7();
    //Aleatorios.Ejercicio9();
    //Aleatorios.Ejercicio11();
}
public static void Ejercicio2(){
String palo ="";
String carta = "";
int numeroPalo= (int) (Math.random()*4) + 1;
switch(numeroPalo){
    case 1:
        palo = "picas";
        break;
    case 2:
        palo = "corazones";
        break;
    case 3:
        palo = "diamantes";
        break;
    case 4:
        palo ="tréboles";
    default:
}
int numeroCarta = (int) (Math.random()*13) + 1;
switch(numeroCarta){
    case 1:
        carta = "As";
        break;
    case 11:
        carta = "J";
        break;
    case 12:
        carta = "Q";
        break;
    case 13:
        carta = "K";
        break;
    default:
        carta =String.valueOf(numeroCarta);   
}
System.out.println(carta + "de " + palo);
}
}
