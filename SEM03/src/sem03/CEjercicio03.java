/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem03;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjercicio03 {
     public static void main(String[] args) {
        float num1, num2, num3, mayor,intermedio,menor;
        num1 = LeerNumero();
        num2 = LeerNumero();
        num3 = LeerNumero();
        mayor = hallarMayor(num1, num2, num3);
        intermedio = hallarIntermedio(num1, num2, num3);
        
        menor = hallarMenor(num1, num2, num3);
        
        imprimir(mayor, menor, intermedio);
        
    }
    static float LeerNumero() {
        Scanner teclado = new Scanner(System.in);
        float num;
        System.out.print("Ingrese un numero: ");
        num = Float.parseFloat(teclado.next());
        return num;
    }
    static float hallarMayor(float num1,float num2,float num3 ){
        float mayor;
            mayor = 0;
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if(num2  > num1 && num2 > num3){
            mayor = num2;
        }else{
            mayor = num3;
        }
        return mayor;
    }
    static float hallarIntermedio(float num1,float num2,float num3){
        float intermedio;
         intermedio =0 ;
        if(num1 < num2 && num1 > num3){
            intermedio=num1;
        }else if(num2 < num1 && num2 > num3){
            intermedio=num2;
        }else{
            intermedio=num3;
        }
        return intermedio;
    }
    static float hallarMenor(float num1,float num2,float num3){
        float menor;
        menor = 0;
        if(num1 < num2 && num1 < num3){
            menor=num1;
        }else if(num2 < num1 && num2 < num3){
            menor=num2;
        }else{
            menor=num3;
        }
        return menor;
    }
    static void imprimir(float mayor,float menor,float intermedio) {
           System.out.println("------------------------------------");
           System.out.println("El numero mayor es: " + mayor);
           
           System.out.println("------------------------------------");
           System.out.println("El numero intermedio es: " + intermedio);
           
           System.out.println("------------------------------------");
           System.out.println("El numero menor es: " + menor);
    }
    
}
