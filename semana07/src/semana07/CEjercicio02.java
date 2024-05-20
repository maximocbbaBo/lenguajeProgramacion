/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana07;
import java.util.Scanner;
/**
 *
 * @author PC13-LAB01 realise un programa que muestre la serie  y reaice la suma
 * la serie de 3,5,6,7,9,9....n terminos
 */
public class CEjercicio02 {
    static int suma;
    static int num;
    public static void main(String[] args) {
         num = numeroEnteros();
         serieNumero(num);
         suma();
        
    }
    public static int numeroEnteros(){
    Scanner teclado = new Scanner(System.in);
        int num;
        do {            
            System.out.println("ingrese un numero : "); 
            num = teclado.nextInt();
        } while (num < 0);
    return num;
    }
    public static void serieNumero(int num){
        int i = 1;
        do {            
            System.out.println(i + ", ");
            suma +=i;
            i++;
        } while (i < num);
        System.out.println("");
    }
     public static void suma(){
        System.out.println("la suma es " + suma);
    }
}
