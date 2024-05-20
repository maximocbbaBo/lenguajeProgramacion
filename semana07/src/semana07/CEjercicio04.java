/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana07;
import java.util.Scanner;
/**
 *
 * @author PC13-LAB01
 */
public class CEjercicio04 {
    static double suma;
    
    public static void main(String[] args) {
        
         int num = numeroTermino();  
        mostrarSerie(num);          
        mostrarSuma();             
    }

    public static int numeroTermino() {
        Scanner teclado = new Scanner(System.in);
        int num;
        do {
            System.out.print("Ingrese un número de términos 'n': ");
            num = teclado.nextInt();
        } while (num <= 0);  
        return num;
    }

   
    public static void mostrarSerie(int num) {
        int numerador = 3;
        int denominador = 2;
        suma = 0.0;

        System.out.print("Serie: ");
        int i = 0;
        do {
            double fraccion = (double) numerador / denominador;
            System.out.print(numerador + "/" + denominador);
            if (i < num - 1) {
                System.out.print(", ");
            }
            suma += fraccion;
            numerador++;
            denominador += 3;
            i++;
        } while (i < num);
        System.out.println(); 
    }

    public static void mostrarSuma() {
        System.out.println("La suma es: " + suma);
    }

    
}
