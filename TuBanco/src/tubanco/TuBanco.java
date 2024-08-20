/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tubanco;

/**
 *
 * @author Juan Felipe Rubio
 */
public class TuBanco {
    protected String nombre;
    protected int edad;
    protected int telefono;
    protected String numeroDeCuenta;
    protected double valorApertura;
    protected boolean haFinalizado;
    protected String mes;
    
    public TuBanco(String nombre, int edad, int telefono, String numeroDeCuenta,double valorApertura, String mes){
        this.nombre = nombre;
        this.edad = edad;
        this.telefono = telefono;
        this.numeroDeCuenta = numeroDeCuenta;
        this.valorApertura = valorApertura;
        this.mes = mes; 
        this.haFinalizado = false;
    }
}
