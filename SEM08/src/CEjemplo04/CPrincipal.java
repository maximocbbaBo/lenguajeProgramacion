/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEjemplo04;
import java.util.Scanner;
/**
 *
 * @author PC13-LAB01
 */
public class CPrincipal {
    static  COperaciones obj = new COperaciones();
    static Cleer num = new Cleer();
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        float num1,num2;
        int opcion;
        
        
        num1 =num.leerNumero();
        obj.setNum1(num1);
        num2 =num.leerNumero();
        obj.setNum2(num2);
        mostrarMenu();
        mostrar();
        
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    mostrarResultados("Suma", obj.suma());
                    break;
                case 2:
                    mostrarResultados("Resta", obj.resta());
                    break;
                case 3:
                    mostrarResultados("Multiplicación", obj.multiplacacion());
                    break;
                case 4:
                    mostrarResultados("División", obj.division());
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
            
        } while(opcion != 5);
    }
     public static void mostrarMenu() {
        System.out.println("------- Menú -------");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        System.out.print("Elija una opción: ");
    }
    public static void mostrar(){
        System.out.println("-------------resultado---------------------------");
        System.out.println("NUmero 1:" + obj.getNum1());
        System.out.println("Numero 2 : " + obj.getNum2());
        System.out.println("Suma : " +  obj.suma());
        System.out.println("Resta : " +  obj.resta());
        System.out.println("Multiplicacion : " +  obj.multiplacacion());
        System.out.println("Division : " +  obj.division());
        System.out.println("--------------------------------------------------");
    }
}
