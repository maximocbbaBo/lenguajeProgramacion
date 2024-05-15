/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem03;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjercicio01 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        float num1, num2;
        num1 = leerNumero();
        num2 = leerNumero();
        suma(num1, num2);
    }
    static float leerNumero() {
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un Numero : ");
        num = Float.parseFloat( teclado.next());      
                return num;
    }
    static void suma(float num1, float num2) {
        float suma;
        suma = num1 + num2;
        System.out.println("La suma es : " + suma);
    }
    
    
}
