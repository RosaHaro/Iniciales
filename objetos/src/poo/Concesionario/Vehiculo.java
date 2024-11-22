package poo;

public class Vehiculo {
    public int DIAS =7;
    String[] diasSemana ={"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
//una clase contiene propiedades y métodos
/*
principio de OCULTACION entre clases de la POO
ámbito de la propiedad o el método): public, private, protected
public: visible a la clase que hereda y a la clase clientela
private: oculta a la clase que hereda y a la clase clientela
protected: oculta a cliente y visible a hereda
NO se deben modificar las propiedades desde el cliente(exterior)
principio de RESPONSABILIDAD
/*****REGLAS DE NEGOCIO*****
 * marca y modelo se guarda en mayuscula y se devuelve en minuscula
 * velocidad debe de ser > 100
 */
double[] kmSemana = new double[7];
public String marca;
private String modelo;
private String color;
private String potencia;
int velocidad;
public double kmTotales=0;

//SOBRECARGA del método: En POO se puede repetir el nombre de métodos en una clase
//los diferencia por el NUMERO y el TIPO de los argumentos
//constructor vacío
//public Vehiculo() { }
    //crear el objeto vacío. Sin referenciar las propiedades

//constructor con parametros para inicializar sus propiedades
//valores por defecto
// public Vehiculo (String marca, String modelo, int velocidad){}
// public Vehiculo (int marca, String modelo){}
//1.Constructor -->creacion
public Vehiculo (String marca, String modelo, int velocidad){
}
//3.Metodos funcionales --> comportamiento
public double kmDia(int dia){
    //d = getindexSemana('Jueves');
return this.kmSemana(dia);
}
public static void generarKmSemana(){
    for(int i=0;i<DIAS ,i++){
        double temp =Math.random()*200;
        this.kmSemana[i]=Math.round(*100.00)/100.00; 
        this.kmTotales+=this.kmSemana[i]; 
      }
// this.setMarca(marca);
// this.setModelo(modelo);
// this.setVelocidad(velocidad);
// this.setColor(color);

}
// this.marca = marca;
// this.modelo = modelo;
// this.velocidad = velocidad;

//métodos getters y setters
//setters: responsables de modificar las propiedades de clase
//añadir color,potencia(w),velocidad(km/h)
//CLASE MOTO: nRuedas, tipo:trial/cross/sport,
//CLASE CAMION: nRuedas, tipo (trailer,reparto,etc),nEjes
//2.metodos getters y setters (R/W)-->validacion/asignacion de datos
public void setMarca (String marca){
    this.marca = marca.toUpperCase();
}
public void setModelo (String modelo){
    this.modelo = modelo.toUpperCase();
}
public void setColor (String color){
    this.color =color.toUpperCase();
}
public void setPotencia (String potencia){
    this.potencia = potencia;
}
public void setVelocidad(int vel){
    if (vel < 100){ //asignamos condiciones
        this.velocidad = 100;
        System.out.println("Error en Velocidad, asignando xDef velocidad mínima");
    }
}
//getters: responsables de leer las propiedades de la clase
public String getMarca(){
    return this.marca;
}
public String getModelo(){
    return this.modelo;
}
public String getColor(){
    return this.color;
}
public String getPotencia(){
    return this.potencia;
}
public int getVelocidad(){
    return this.velocidad;
}
//3.Impresion de datos
//visualizacion de datos en la clase
public void Info(){
    System.out.println("Vehiculo" +this.getMarca() + " "+ this.getModelo() + " " + this.getColor() + " " + this.getPotencia()+ " " + this.getVelocidad()+" ");
}
public String toString(){
    //este metodo devuelve un string con toda la SALIDA FORMATEADA
    String info = "";
    info= "Vehiculo { \n"
        + "Marca: " + this.marca + " \n" 
        + "Modelo: "+ this.modelo + " \n " 
        +"Color: " + this.color + "\n"
        +"Velocidad: " + this.velocidad + "km/h \n"

    String kmdias ="";
    for (int i = 0; i < DIAS; i++) {
        kmdias= kmdias + diasSemana[i] + ": " + kmSemana[i] + "\n";
        
    }
    info = info.concat("Viajes: ").concat(kmdias).concat("}");
    info = info + "}";
    return info;
}
}
