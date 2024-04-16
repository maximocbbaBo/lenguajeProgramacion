/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ejercicio2 {
     public static void main(String[] args) {
        float altura,peso,respuestaImc;
        Scanner teclado=  new Scanner(System.in);
        System.out.println("dime el peso de la persona:");
        peso=Float.parseFloat(teclado.nextLine());
        System.out.println("dime la altura de la persona:");
        altura=Float.parseFloat(teclado.nextLine());
        respuestaImc=altura/(peso*peso);
        System.out.println("el peso ism es: "+ respuestaImc);
    }

}
