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
public class CEjercicio03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de términos para la serie: ");
        int N = scanner.nextInt();

        System.out.println("Usando while:");
        imprimirSerieYSumarConWhile(N);

        System.out.println("\nUsando do-while:");
        imprimirSerieYSumarConDoWhile(N);
    }

    public static void imprimirSerieYSumarConWhile(int N) {
        int termino = 3;
        int suma = 0;
        int contador = 0;

        System.out.print("Serie: ");
        while (contador < N) {
            System.out.print(termino + " ");
            suma += termino;
            termino = siguienteTermino(termino);
            contador++;
        }

        System.out.println("\nSuma de los primeros " + N + " términos: " + suma);
    }

    public static void imprimirSerieYSumarConDoWhile(int N) {
        int termino = 3;
        int suma = 0;
        int contador = 0;

        System.out.print("Serie: ");
        do {
            System.out.print(termino + " ");
            suma += termino;
            termino = siguienteTermino(termino);
            contador++;
        } while (contador < N);

        System.out.println("\nSuma de los primeros " + N + " términos: " + suma);
    }

    public static int siguienteTermino(int num) {
        int siguiente = num + 2;
        if (siguiente % 3 == 0 || siguiente % 5 == 0) {
            return siguiente;
        } else {
            return siguienteTermino(siguiente);
        }
    }
}
