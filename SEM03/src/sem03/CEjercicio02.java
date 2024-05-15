/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem03;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjercicio02 {
    static float num1, num2;
    
    public static void main(String[] args) {
        float su;
        num1 = LeerNumero();
        num2 = LeerNumero();
        su = suma();
        System.out.println("la suma es : ()" + su);
    }
    
    static float LeerNumero() {
        Scanner teclado = new Scanner(System.in);
        float num ;
        System.out.println("Ingrese un Numero : ()");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float suma(){
        float suma ;
        suma = num1 + num2;
        return suma;
    }
}
