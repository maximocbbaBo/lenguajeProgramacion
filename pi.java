/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package semana09.newpackage;
import java.util.Scanner;
/**
 *
 * @author PC13-LAB01
 */
public class pi {
    static double num;
    public static double leerNuemro(){
        Scanner tecla = new Scanner(System.in);
        System.out.println("diga un numero");
        num = tecla.nextDouble();
        return num;
    }
    public static double pi(double num){
        double  respuestaPi = Math.sqrt(num);
        return respuestaPi;
    }
    public static void main(String[] args) {
        leerNuemro();
        pi(num);
        System.out.println("el pi es : " + pi(num));
    }
}
