public class Aleatoriosprueba1 {
        public static void main(String[] args) {
        Aleatoriosprueba1.Ejercicio2();
       
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
    carta = switch (numeroCarta) {
                case 1 -> "As";
                case 11 -> "J";
                case 12 -> "Q";
                case 13 -> "K";
                default -> String.valueOf(numeroCarta);
            };
    System.out.println(carta + "de " + palo);
    }
}
