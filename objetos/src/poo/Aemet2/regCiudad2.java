package poo.Aemet2;

import java.util.ArrayList;

public class regCiudad2 {

    public  final int NDIAS = 7;
    public  final int NTEMP = 3;
    
    private ArrayList<String> dias = new ArrayList<>(); //1D

    private String nombre;
    private int vmax;
    private int vmin;
    int[][] temperaturas1 = new int[NDIAS][NTEMP];
    ArrayList<ArrayList<Integer>> temperaturas = new ArrayList<>();
    

    public regCiudad2(String nombre){
        this.setNombre(nombre);
        this.setVmin(-1);
        this.setVmax(40);
        this.setDias();
        this.GenerarTemperaturas();
        this.mostrarTemperaturas();
    }
    

    public void setDias(){
        this.dias.add("Lunes"); this.dias.add("Martes"); this.dias.add("Miercoles"); this.dias.add("Jueves"); 
        this.dias.add("Viernes"); this.dias.add("Sabado"); this.dias.add("Domingo"); 
    }
   
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setVmax (int vmax){
        this.vmax = vmax;
    }
    public void setVmin (int vmin){
        this.vmin = vmin;
    }

    public void GenerarTemperaturas(){
        //las 3 temperaturas de 1 DIA
        ArrayList<Integer> tempDia = new ArrayList<>();
        for (int i=0; i<3; i++){
            tempDia.add(0);
        }
        for (String nombre: this.dias){
            // lunes(0), martes(1) ...

            ArrayList<Integer> tempDia = new ArrayList<>();
            for (int i=0; i<3; i++){
                tempDia.add(0);
            }
            for (int j=0; j<3; j++ ){ //3 temperaturas por dia
                int temperatura = (int) (Math.random() * (this.vmax - this.vmin + 1)) + this.vmin;
                tempDia.set(j, temperatura);
                // tempDia.add(temperatura);   
            }
            // tengo en el array "tempdia" las 3 temperaturas del dia 
            this.temperaturas.add(tempDia);
        }
    }
    public void mostrarTemperaturas() {
        
        ArrayList<Integer> tempDia = new ArrayList<>();

        for (int i=0; i<this.temperaturas.size(); i++){
            System.out.println("Dirección array tempDia (hashCaode):"+Integer.toHexString(System.identityHashCode(tempDia)));
            //System.out.print(this.temperaturas.get(i));
            tempDia = this.temperaturas.get(i);
            for (int temp: tempDia ){
                System.out.print(temp + "["+ Integer.toHexString(System.identityHashCode(temp))+"],");
            }
            System.out.println();
        }
       
    }
 
}
