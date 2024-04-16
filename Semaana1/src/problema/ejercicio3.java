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
public class ejercicio3 {
    public static void main(String[] args) {
        int precioMetro,largo,ancho,resultaTerreno;
        
        precioMetro=750;
        
        Scanner teclado=new Scanner(System.in);
        System.out.println("dime el frontis del terreno:");
        ancho=Integer.parseInt(teclado.nextLine());
        System.out.println("dime el largo del terreno:");
        largo=Integer.parseInt(teclado.nextLine());
        resultaTerreno=largo*ancho*precioMetro;
        System.out.println("el precio del terreno es: "+resultaTerreno);
        resultaTerreno=Integer.parseInt(teclado.nextLine());
    }

}
