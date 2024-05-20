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
public class CEjercicio05 {
    static int num;
    public static void main(String[] args) {
        num = numerosEnteros();
        System.out.println("dijite un numero ahora : ");
        
    }
    public static int numerosEnteros(){
        Scanner tecla = new Scanner(System.in);
        num = tecla.nextInt();
        for (int i = 1; i < 10; i++) {
            i++;
        }
        return ;
    }
}
