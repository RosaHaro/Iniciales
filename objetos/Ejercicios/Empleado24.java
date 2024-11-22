import java.util.Scanner;

public class Empleado24 {
    public static int horaExtra = 30;
    public static Scanner entrada = new Scanner(System.in);

    public static String nombre;
    public static char estadoCivil;
    public static int cargo;
    public static int diasVisita;
    public static double salarioNeto; //SNet =Sbr - SRetencion
       //porque se necesitan en el calculo y en la visualización
       //las de abajo son variables intermedias porque dependen de otras
       //Ej: irpf depende de estado civil
    //public static int salarioBase;
    //public static double irpf; //0.25 o 0.20
    public static int salarioBruto;//SBr = SB + Dietas
    
    public static int dietas; //SDietas--> ndias * 30€
    public static double retencion;//SRetencion = SBr * irpf
    public static void main(String[]args){
        //la main se dedica a orquestar--> CONTROLAR
        Empleado24.entradaDatos();
        Empleado24.calcularSalario();
        Empleado24.MostrarDatos();
    }    

     public static void entradaDatos() {
        System.out.println("Nombre: ");
        Empleado24.nombre = Empleado24.entrada.next();
        System.out.println("-----Cargo------");
        System.out.println("1- Programador Junior" );
        System.out.println("2- Programador senior" );
        System.out.println("3- Jefe de Proyecto" );
        System.out.print("Introduzca el cargo del empleado (1-3): ");
        Empleado24.cargo = Empleado24.entrada.nextInt();
        System.out.print("¿Cuántos días ha estado de viaje visitando clientes? ");
        Empleado24.diasVisita = Empleado24.entrada.nextInt();
        System.out.print("Introduzca su estado civil (S- soltero), C- Casado: ");
        Empleado24.estadoCivil = Empleado24.entrada.next().toUpperCase().charAt(0);
     }
    public static int calcularSBase(){
       //int salarioBase;
       //int salarioBruto;
       //double irpf;
       //double retencion;
       int sbase = 0;
       //fijar salario base
        switch (Empleado24.cargo){
              
                case 1:
                sbase = 950;
                    //Empleado24.sbase = 950;
                    break; 
                    case 2:
                    //Empleado24.sbase = 1200;
                sbase = 1200;    
                    break;
                case 3:
                    //Empleado24.sbase = 1600;
                sbase = 1800;    
                    break;
         }
         return sbase;
    }        
    public static double calcularIRPF(){
    //fijar irpf
        double irpf = 0;
         switch(Empleado24.estadoCivil){
            case 'S':
                irpf = 0.25;
                //Empleado24.irpf = 0.25;
                break;
            case 'C' :
                //Empleado24.irpf = 0.20;
                irpf = 0.20;
                break;
        }
        return irpf;
    }
    public static void calcularSalario(){
        //int sbase = Empleado24.calcularSBase ();
        //Empleado24.calcularIRPF();

    Empleado24.dietas = Empleado24.diasVisita * Empleado24.horaExtra;
    Empleado24.salarioBruto = Empleado24.calcularSBase() + Empleado24.dietas;
    Empleado24.retencion = Empleado24.salarioBruto * Empleado24.calcularIRPF();
    Empleado24.salarioNeto = Empleado24.salarioBruto - Empleado24.retencion;

    }

public static void MostrarDatos(){
    System.out.println("--------------------------");
    System.out.printf("Salario Base %12d€\n", Empleado24.calcularSBase());
    System.out.printf("Dietas (%d viajes) %2d€\n", Empleado24.diasVisita,Empleado24.dietas);
    System.out.println( "---------------");
    System.out.printf("Salario Bruto %12d€", Empleado24.salarioBruto);
    System.out.printf("Retencion IRPF (%f) %2f€\n", Empleado24.calcularIRPF()*100, Empleado24.retencion);
    }


}
