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
public class CEjercicio05 {
     public static double porcentajeMayor(double productos){
    return productos * 0.20;
    }
    public static double porcentajeMenor(double productos){
    return productos * 0.10;
    }
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        double productoOne=20;
        System.out.println("dime la cantidad que vas a comprar : ");
        double productos=teclado.nextDouble();
        System.out.println("la cantidad es : " + productos);
        if (productos > 10) {
            System.out.println("TOTAL A PAGAR DE :  " +  (productos * productoOne) + 0.20);
        }
        else if(productos <=10){
            System.out.println("TOTAL A PAGAR DE :"  + (productos *productoOne) + 0.10);
        }
    }
}
