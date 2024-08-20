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
    
    public void registrartarjeta(){
        System.out.println("\n Siguiente...");
        Scanner sc = new Scanner(System.in);
        System.out.print("\n Registre el tipo de tarjeta el cual pertenece");
        System.out.println("\n1. Tarjeta Joven");
        System.out.println("2. Tarjeta Nomina");
        System.out.println("3. Tarjeta Visa");
        int tipo = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Nombre del propieatrio de la tarjeta: ");
        String nombre = sc.nextLine();
        System.out.print("Edad: ");
        String edad = sc.nextLine();
        System.out.print("Edad: ");
        String telefono = sc.nextLine();
}

 public static void main(String[] args) {
        Main sistema = new Main ();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\nBuenos días...");
            System.out.println("Buenas tardes...");
            System.out.println("Buenas noches...");
            System.out.println("\n Bienvenido a Tu Banco, que deseas realizar el día de hoy?");
            System.out.println("\n1. Registrar Partido");
            System.out.println("2. Finalizar Partido");
            System.out.println("3. Mostrar Ganador");
            System.out.println("4. Mostrar Información de Partidos");
            System.out.println("5. Salir");
            System.out.print("Elija una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    sistema.registrartarjeta();
                    break;
              
                case 5:
                    System.out.println("Vmz...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);
    }
}