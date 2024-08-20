/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubanco;

/**
 *
 * @author Juan Felipe Rubio
 */
public abstract class TuBanco {
    protected String nombre;
    protected int edad;
    protected String telefono;  // Cambiado a String
    protected String numeroDeCuenta;
    protected double valorApertura;
    protected boolean haFinalizado;
    protected String mes;
    
    public TuBanco(String nombre, int edad, String telefono, String numeroDeCuenta, double valorApertura, String mes){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.numeroDeCuenta = numeroDeCuenta;
        this.valorApertura = valorApertura;
        this.mes = mes; 
        this.haFinalizado = false;
    }
    
    public String obtenerInfo(){
        return String.format("Nombre: %s, Teléfono: %s, Edad: %d, Finalizado: %s",
                nombre, telefono, edad, haFinalizado ? "Sí" : "No");
    }
}
