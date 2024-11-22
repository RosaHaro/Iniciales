package Concesionario;
import java.util.Scanner;
import Vehiculo;

public class Concesionario{
    public static int NVEHICULOS =5;
    public static Scanner entrada = new Scanner(System.in);
    public static Vehiculo [] vehiculos = new Vehiculo[NVEHICULOS];
    public static void main (String []args){
        Concesionario.lecturaVehiculos();
        Concesionario.ImprimirVehiculos();
        Concesionario.kmTotalesFlota();
        Concesionario.kmTotalesDia();
        }
    public static void kmTotalesDia(){
        System.out.print("Día: ");
        int dia= Concesionario.entrada.nextInt();
        int suma =0;
        for (int i = 0; i < NVEHICULOS; i++) {
            suma += vehiculos[i].kmDia(dia);
    }
    System.out.println("En el día " + dia + "se hacen " + suma + " kms.");
    public static void kmTotalesFlota(){
        double suma =0;
        for (int i = 0; i < NVEHICULOS; i++) {
            suma += vehiculos[i].kmTotales;
            System.out.println("Km Flota: " + suma);
        }
       
    }
    public static void ImprimirVehiculos(){
        for (int i = 0; i < NVEHICULOS; i++) {
            System.out.println(vehiculos[i]);
        }
    }
    public static void lecturaVehiculos(){
        String marca; String modelo; int velocidad;
        //***entrada de datos */
        for (int i = 0; i < NVEHICULOS; i++) {
            System.out.print("Marca vehículos" + (i+1) + " : ");
            marca = Concesionario.entrada.nextLine();
            System.out.print("Modelo vehículos" + (i+1) + " : ");
            modelo = Concesionario.entrada.nextLine();
            System.out.print("Velocidad vehículos" + (i+1) + " : ");
            velocidad = Concesionario.entrada.nextInt();
            vehiculos[i] = new Vehiculo(marca, modelo, velocidad);
            vehiculos[i].generarKmSemana();
            System.out.println();
        }
    }
}













        // Vehiculo v1 = new Vehiculo("Peugeot","208",90);
        // Vehiculo v2 = new Vehiculo("Audi", "A3", 260);
        // Vehiculo v3 = new Vehiculo("Mercedes", "CLA", 280);
        // System.out.println(v1);
        // System.out.println(v2);
        // System.out.println(v3);
        
        //-------------------
        //crear objeto o instancia
        // Vehiculo v1 = new Vehiculo();
        // v1.setMarca("Peugot");
        // v1.setModelo("206");
        // v1.setColor("azul");
        // v1.setPotencia("8000");
        // v1.setVelocidad("150");
        // Vehiculo v2 = new Vehiculo();
        // v2.setMarca("Audi");
        // v2.setModelo("A3");
        // v2.setColor("verde");
        // v2.setPotencia("6000");
        // v2.setVelocidad("180");
        // System.out.println("Vehiculo1: " + v1.getMarca()+ " " + v1.getModelo());
        // System.out.println("Vehiculo2: " + v2.getMarca() + " " + v2.getModelo());
    
        // v1.Info();
        // v2.Info();
        // System.out.println(v1);
        // System.out.println(v2);
