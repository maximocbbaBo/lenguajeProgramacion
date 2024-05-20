/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package semana07;
import java.util.Scanner;
/**
 *
 * @author PC13-LAB01
 */
public class CEjercicio01 {

    /**
     * @param args the command line arguments
     */
     static int suma;
     public static void main(String[] args) {
        // TODO code applicatiosn logic here
        //System.out.println("dime un  numero");
        int  num;
        num = numeroEnteros();
        mostrarSerie(num);
        suma();
    }
    
    public static  int numeroEnteros(){
    Scanner teclado = new Scanner(System.in);
    int num;
        do {            
            System.out.println("ingrese un numero : "); 
            num = teclado.nextInt();
        } while (num < 0);
    return num;
    }
    public static void mostrarSerie(int num){
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
