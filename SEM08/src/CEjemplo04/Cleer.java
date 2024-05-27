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
public class Cleer {
     public static float leerNumero(){
    float num;
    Scanner tecla = new Scanner(System.in);
    
        do {            
            System.out.println("ingrese un numero");
            num = tecla.nextFloat();
        } while (num < 0);
        return num;
    }
}
