package poo;
import java.util.Scanner;
public class Camion {

        private int numeroRuedas;
        private int numeroEjes;
        private String tipoCamion;
    
        public Camion(int numeroRuedas, int numeroEjes, String tipoCamion) {
            this.numeroRuedas = numeroRuedas;
            this.numeroEjes = numeroEjes;
            this.tipoCamion = tipoCamion;
        }
    
        public int getNumeroRuedas() {
            return numeroRuedas;
        }
    
        public void setNumeroRuedas(int numeroRuedas) {
            this.numeroRuedas = numeroRuedas;
        }
    
        public int getNumeroEjes() {
            return numeroEjes;
        }
    
        public void setNumeroEjes(int numeroEjes) {
            this.numeroEjes = numeroEjes;
        }
    
        public String getTipoCamion() {
            return tipoCamion;
        }
    
        public void setTipoCamion(String tipoCamion) {
            this.tipoCamion = tipoCamion;
        }
    
        public void mostrarInformacion() {
            System.out.println("Información del camión:");
            System.out.println("Número de ruedas: " + numeroRuedas);
            System.out.println("Número de ejes: " + numeroEjes);
            System.out.println("Tipo de camión: " + tipoCamion);
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Ingrese el número de ruedas del camión: ");
            int ruedas = scanner.nextInt();
    
            System.out.print("Ingrese el número de ejes del camión: ");
            int ejes = scanner.nextInt();
            scanner.nextLine(); 
    
            System.out.print("Ingrese el tipo de camión: ");
            String tipo = scanner.nextLine();
    
            
            Camion camion = new Camion(ruedas, ejes, tipo);
    
            camion.mostrarInformacion();
    
        }
    }