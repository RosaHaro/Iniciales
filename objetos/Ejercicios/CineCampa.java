import java.util.Scanner;

public class CineCampa{
    public static int precioBase;
    public static int precioGrupo;
    public static int numeroEntradas;
    public static String diaSemana;
    public static double tarjetaCampa;
    public static double precioDto;
    public static double precioTotal;
   
    public static final int precioPareja = 11;
    public static Scanner entrada = new Scanner(System.in); 
    public static int numeroParejas;
    public static int individuales;
    public static String entradaDatos;
    public static double calcularPrecioTotal;
    public static int calcularGrupo;
    public static double calcularDtoTarjeta;
    public static void main(String[]args){

        CineCampa.entradaDatos();
        CineCampa.calcularPrecioTotal();
        CineCampa.imprimirTicket();
    }
    public static void entradaDatos(){
    
            System.out.println("Venta de entrada de Cine Campa.");
            System.out.println("----------------------");
            System.out.print("Número de entradas: ");
            CineCampa.numeroEntradas = CineCampa.entrada.nextInt();
            System.out.println("Día de la semana: ");
            CineCampa.diaSemana = CineCampa.entrada.next().toLowerCase();
            System.out.println("¿Tiene la tarjeta Campa?: s/n");
            CineCampa.tarjetaCampa = CineCampa.entrada.next().toLowerCase().charAt(0);
    }
    public static void calcularPrecioTotal(){
            CineCampa.calcularPrecioBase();
            CineCampa.precioTotal = CineCampa.calcularPrecioGrupo() - CineCampa.calcularDtoTarjeta();
                
    }
    public static void calcularPrecioBase(){
        CineCampa.precioBase = 8;
        if(CineCampa.diaSemana.equals("miércoles")){
            CineCampa.precioBase = 5;
        }
    }
    public static int calcularPrecioGrupo(){
        int precioGrupo = 0;
        int precioPareja = 0;
        int precioIndividual = 0;
        if (CineCampa.diaSemana.equals("jueves")){
            CineCampa.numeroParejas = CineCampa.numeroEntradas/2;
            CineCampa.individuales =CineCampa.numeroEntradas%2;
            precioPareja =CineCampa.numeroParejas * CineCampa.precioPareja;
            
        }else{
            CineCampa.numeroParejas =0;
            CineCampa.individuales = CineCampa.numeroEntradas;            
        }
        precioIndividual =CineCampa.individuales * CineCampa.precioBase;
        precioGrupo = precioPareja + precioIndividual;
        CineCampa.precioGrupo = precioGrupo; //fijamos la propiedad
        return precioGrupo; //devolvemos valor
    }
    public static double calcularDtoTarjeta(){
        double dto = 0;
        if(CineCampa.tarjetaCampa == 's'){
            
        }
        return dto;
    }

    public static void imprimirTicket(){
        System.out.println("-----------------------------------");
        System.out.println("Aquí tiene sus entradas. Gracias por su compra");
        if(CineCampa.diaSemana.equals("jueves"))

    }

}    
    
