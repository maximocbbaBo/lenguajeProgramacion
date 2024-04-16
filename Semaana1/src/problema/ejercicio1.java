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
public class ejercicio1 {
    public static void main(String[] args) {
        int altura,base,area;
        Scanner teclado= new Scanner(System.in);
        System.out.println("dejite la altura del rectangulo:");
        altura=Integer.parseInt(teclado.nextLine());
        System.out.println("dejite la base del rectangulo:");
        base=Integer.parseInt(teclado.nextLine());
        area=altura*base;
        System.out.println("el area del rectangulo es:"+ area);
    }
}
