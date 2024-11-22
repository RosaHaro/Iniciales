package poo;
import java.util.Scanner;

public class Moto {
    
        private String numeroRuedas;
        private String tipoMoto;

        public Moto(String numeroRuedas, String tipoMoto) {
            this.numeroRuedas = numeroRuedas;
            this.tipoMoto = tipoMoto;
        }
    
        public String getNumeroRuedas() {
            return this.numeroRuedas;
        }
    
        public void setNumeroRuedas(String numeroRuedas) {
            this.numeroRuedas = numeroRuedas.toUpperCase();
        }
    
        public String getTipoMoto() {
            return tipoMoto.toUpperCase();
        }
    
        public void setTipoMoto(String tipoMoto) {
            this.tipoMoto = tipoMoto.toUpperCase();
        }
    
        public void mostrarInformacion() {
            System.out.println("Información de la moto:");
            System.out.println("Número de ruedas: " + numeroRuedas);
            System.out.println("Tipo de moto: " + tipoMoto);
        }
    
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Ingrese el número de ruedas de la moto: ");
            String ruedas = scanner.nextLine();
         
            System.out.print("Ingrese el tipo de moto: ");
            String tipo = scanner.nextLine();
            
            Moto moto = new Moto(ruedas,tipo);
    
            moto.mostrarInformacion();
    
        }
    }
