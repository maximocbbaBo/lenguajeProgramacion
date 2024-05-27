/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CEjemplo04;

/**
 *
 * @author PC13-LAB01
 */
public class COperaciones {
    private float num1 ,num2;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }
    
    public float  suma(){
     float suma;
     suma = num1 + num2;
     return suma;
    }
    
    public float resta(){
    return num1 - num2;
    
    }
    
    public float multiplacacion(){
    return num1 * num2;
    
    }
    
    public float division(){
         if (num1 == 0 || num2 == 0) {
            System.out.println("numero indifenido..");
        }  
         else {
             System.out.println(" ");
        }
    return num1 / num2;
       
    }
    
}
