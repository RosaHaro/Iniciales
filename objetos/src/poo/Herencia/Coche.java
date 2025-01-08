package poo.Herencia;
//new Vehiculo(4,250,180)
//new Coche (nR,vel,pot,nP)

public class Coche extends Vehiculo {
    private int nPuertas;
    public Scanner 
    Coche(){
        super():
        //super.pedirDatos();
        this.pedirDatos():
    }
//el constructor de la subclase (coche) llama, con super(),
//al constructor de la superclase(vehiculo)
    Coche(String marca, String modelo, int ruedas, int velocidad, int potencia, int puertas){
        super(marca, modelo,ruedas, velocidad, potencia);
        setnRuedas(puertas);
        //this.nPuertas=3;
        this.setnPuertas(3);
    }
    
    public int getnPuertas(){
        return nPuertas;
    }
    public void setnPuertas(int p){
        this.nPuertas =p;
    }
    //redefinir los getkmTotales del padre

    public int getkmTotales() {
        return 10 + super.getkmTotales();
    }
    public String toString(){
        String info = super.toString();
        info = info +"\tnPuertas: " + this.getnPuertas() + "\n";
        info = info + "\tkmTotales: " + this.getkmTotales() + "\n";
        return info;
    }
    
}
