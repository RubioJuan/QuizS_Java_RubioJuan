/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tubanco;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan Felipe Rubio
 */

public class Main {
    private ArrayList<TuBanco> tuBanco;
    
    public Main(){
        tuBanco = new ArrayList<>();
    }
    
    public void agregarTarjeta(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nSeleccione el tipo de tarjeta:");
        System.out.println("1. Tarjeta Joven");
        System.out.println("2. Tarjeta Nomina");
        System.out.println("3. Tarjeta Visa");
        int tipo = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nombre del propietario de la tarjeta: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();
        System.out.print("Número de cuenta: ");
        String numeroDeCuenta = sc.nextLine();
        System.out.print("Valor de apertura: ");
        double valorApertura = sc.nextDouble();
        sc.nextLine();
        System.out.print("Mes de apertura: ");
        String mes = sc.nextLine();
        
        TuBanco tarjeta = null;
        switch (tipo) {
            case 1:
                tarjeta = new Joven(nombre, edad, telefono, numeroDeCuenta, valorApertura, mes);
                break;
            case 2:
                tarjeta = new Nomina(nombre, edad, telefono, numeroDeCuenta, valorApertura, mes);
                break;
            case 3:
                tarjeta = new Visa(nombre, edad, telefono, numeroDeCuenta, valorApertura, mes);
                break;
            default:
                System.out.println("Tipo de tarjeta no válido.");
                return;
        }
        
        tuBanco.add(tarjeta);
        System.out.println("Tarjeta registrada exitosamente.");
    }
    
    public void leerTarjetas(){
       for(int i = 0; i < tuBanco.size(); i++){
           TuBanco tubanco = tuBanco.get(i);
           System.out.println("Tarjeta " + (i + 1) + ": " + tubanco.obtenerInfo());
       } 
    }

    public static void main(String[] args) {
        Main sistema = new Main();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nBienvenido a Tu Banco, ¿qué deseas realizar el día de hoy?");
            System.out.println("1. Registrar Tarjeta");
            System.out.println("2. Registrar Cartera");
            System.out.println("3. Mostrar Información acerca de la tarjeta");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sistema.agregarTarjeta();
                    break;
                case 2:
                    // Código para registrar cartera (aún no implementado)
                    break;
                case 3:
                    sistema.leerTarjetas();
                    break;
                case 4:
                    System.out.println("Hasta luego, vuelva pronto");
                    break;
                default:
                    System.out.println("Error... Opción no válida.");
            }
        } while (opcion != 4);
    }
}