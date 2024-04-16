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
public class ejercicio4 {
     public static void main(String[] args) {
        float radioArea,alturaArea,pi,area,radioVolumen,alturaVolumen,volumen;
        pi=3.14159F;
        Scanner teclado=new Scanner(System.in);
        System.out.println("Halla el area de un cilindro:");
        System.out.println("dime el radio del cilindro:");
        radioArea= Float.parseFloat(teclado.nextLine());
        System.out.println("dime la altura del cilindro:");
        alturaArea=Float.parseFloat(teclado.nextLine());
        area=2* pi*radioArea*(alturaArea+radioArea);
        System.out.println("la area del cilindro es:"+area);
        area=Float.parseFloat(teclado.nextLine());
        
        System.out.println("Halla el volumen del cilindro:");
        System.out.println("dime el radio del cilindro para hallar el volumen:"
                + "");
        radioVolumen=Float.parseFloat(teclado.nextLine());
        System.out.println("dime la altura del cilindro oara hallar el volumen:"
                + "");
         alturaVolumen=Float.parseFloat(teclado.nextLine());
         volumen=pi*radioVolumen*radioVolumen*alturaVolumen;
         System.out.println("El volumen del cilindro es:"+volumen);
         volumen=Float.parseFloat(teclado.nextLine());
    }

}
