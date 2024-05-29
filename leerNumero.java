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
public class leerNumero {
    static float num;
    static float numDos;
    public static float leerNumero(){
        Scanner tecla = new Scanner(System.in);
        System.out.println("diga un numero");
        num = tecla.nextFloat();
        System.out.println("diga un numero 2");
        return num;
    }
     public static float leerNumeroDos(){
        Scanner tecla = new Scanner(System.in);
        System.out.println("diga un numero");
        numDos = tecla.nextFloat();
        System.out.println("diga un numero 2");
        return numDos;
    }

    public static float mayorEs(float num,float numDos){
        float respuesta = Math.max(num, numDos);
        return respuesta;
    }
    public static void main(String[] args) {
        leerNumero();
        leerNumeroDos();
        mayorEs(num, numDos);
        System.out.println("el numero mayor es : " + mayorEs(num, numDos));
    }
    
}
