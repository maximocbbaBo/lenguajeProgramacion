/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sema06;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjercicio05 {
    //static int num;
    public static void main(String[] args) {
        int num;
        num = numTermino();
        mostrarSerie(num);
    }
    public static int numTermino(){
        Scanner teclado = new Scanner(System.in);
        int num;
        do {            
            System.out.println("ingrese un numero");
            num = teclado.nextInt();
        } while (num <= 0);
        return num;
    }
    public static void mostrarSerie(int num){
        int i =  num;
        for (; i >= 1;) {
            System.out.println(i +",");
            i--;
        }
        System.out.println("");
    }
}
