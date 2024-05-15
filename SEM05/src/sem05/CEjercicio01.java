/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sem05;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjercicio01 {

    /**
     * @param args the command line arguments
     */
     public static double brochasCerdasPrice(double cantidad){
        double price = 20;
        return price;
    }
    
    public static double rodillosPrice(double cantidadRoillo){
        double price = 45;
        return price;
    }
    
     public static double selladorPrice(double cantidadSellador){
        double price = 10;
        return price;
    }
    public static double priceEnd(double cantidad){
        double brochasCerdasPrice=brochasCerdasPrice(cantidad);
        return cantidad * brochasCerdasPrice;
    }
     public static double priceEndRodillo(double cantidadRodillo){
        double rodillosPrice=rodillosPrice(cantidadRodillo);
        return cantidadRodillo * rodillosPrice;
    }
    
     
     public static double priceEndSellador(double cantidaSellador){
        double selladorPrice=selladorPrice(cantidaSellador);
        return cantidaSellador * selladorPrice(cantidaSellador);
    }
     
     
     public static double descuentoBrocha(double cantidad){
         double priceEnd=priceEnd(cantidad);
         return priceEnd * 0.20;
     
     }
     
     
     public static double descuentoRodillo(double cantidadRoillo){
         double priceEndRodillo=priceEndRodillo(cantidadRoillo);
         return priceEndRodillo(cantidadRoillo) * 0.15;
     
     }
     
     public static double descuentoSellador(double cantidadSellador){
         double selladorPrice=selladorPrice(cantidadSellador);
         return priceEndSellador(cantidadSellador) * 0.05;
     
     }
    //public static descuentoBrocha(double brocha,double cantidad){
        
    //}
    public static void main(String[] args) {
        Scanner tecla=new Scanner(System.in);
        System.out.println("dime la cantidad de brochas : ");
        double cantidad=tecla.nextDouble();
        System.out.println("cantidad de brocha: " + cantidad);
        System.out.println("precio total : " + priceEnd(cantidad));
            System.out.println("descuento de rodillo es : " + descuentoBrocha(cantidad));
        System.out.println("dime la cantidad de rodillos ");
        double cantidadRoillo=tecla.nextDouble();
        System.out.println("cantidad rodillos: " + cantidadRoillo);
        System.out.println("precio total rodillos: " + priceEndRodillo(cantidadRoillo) );
        System.out.println("descuento de rodillo es : " + descuentoRodillo(cantidadRoillo));
        
        System.out.println("la cantidad de sellador es : ");
        double cantidaSellador=tecla.nextDouble();
        System.out.println("toalde sellador : " + cantidaSellador);
        System.out.println("precio total de sellador : " + priceEndSellador(cantidaSellador));
        System.out.println("descuento de rodillo es : " + descuentoSellador(cantidaSellador));
        
    }
    
}
