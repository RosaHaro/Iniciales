package poo.Herencia;

public abstract class Vehiculo {
    protected int nRuedas;
    protected int velocidad;
    protected int potencia;
    private int kmTotales;

    public int nRuedas{
        return nRuedas;
    }
    public void setnRuedas (int ruedas){
        nRuedas= ruedas;
    }
    public int getVelocidad(){
        return velocidad;
    }
    public void setVelocidad(int vel){
        velocidad=vel;
    }
    public int getPotencia(){
        return potencia;
    }
    public void setPotencia(int pot){
        potencia=pot;
    }
}
