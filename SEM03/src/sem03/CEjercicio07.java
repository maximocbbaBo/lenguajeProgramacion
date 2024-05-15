/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem03;
import  java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjercicio07 {
    public static double comision(double ventas){
            if (ventas > 15000) {
                double resultadoStronger=ventas * 0.08;
                System.out.println("El TOTAL DE LA COMISION ES : " + resultadoStronger);
        }else if(ventas < 15000){
                double resultadoDebil=ventas * 0.05;
                System.out.println("El TOTAL DE LA COMISION ES :" + resultadoDebil);
        }
            return ventas;
    }
    public static double sueldoBruto(double ventas){
        double sueldoBasico=600;
        double bonificacion=bonificacion(ventas);
        double comision=comision(ventas);
        return bonificacion + sueldoBasico + comision;
    }
    public static double bonificacion(double hijos){
        if (hijos < 5){
            double ventiFive=25;
            double resultHijos=hijos *ventiFive ;
            System.out.println("LA BONIFICACION ES : " + resultHijos);
        }else if(hijos > 5){
             double ventiTwo=22;
             double hijosResult=hijos * ventiTwo;
              System.out.println("LA BONIFICACION ES : " + hijosResult);
        }
        return hijos;
    }
    public static double descuento(double ventas){
        double sueldoBruto=sueldoBruto(ventas);
        if(sueldoBruto > 3500){
            double resultDescuentoMore=sueldoBruto * 0.15;
            System.out.println("EL DESCUENTO ES: " + resultDescuentoMore);
        }else if(sueldoBruto < 3500){
            double resultDescuentoBit=sueldoBruto * 0.11;
            System.out.println("EL DESCUENTO ES : " + resultDescuentoBit);
        }
        return ventas;
    }
    public static double sueldoNeto(double ventas){
        double sueldoBruto=sueldoBruto(ventas);
        double descuento=descuento(ventas);
        return sueldoBruto-descuento;
    }
     public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
         System.out.println("CUANTO ES LA VENTA REGISTRADA : ");
         double ventas=teclado.nextDouble();
         System.out.println("-------------------------------------");
         System.out.println("DIME LA CANTIDAD DE HIJOS: ");
         double hijos=teclado.nextDouble();
         double hijosBo=bonificacion(hijos);
         double bono=bonificacion(hijos);
         
         System.out.println("-------------------------------------");
         System.out.println("la cantidad de hijos es: " + hijos);
         
         System.out.println("LA VENTA REGISTRADA ES : " + ventas);
         System.out.println("-------------------------------------");
         System.out.println("EL COMISION ES : " + comision(ventas));
         
         System.out.println("-------------------------------------");
         System.out.println("BONIFICACION ES: "  + bono);
         
         System.out.println("-------------------------------------");
         System.out.println("SUELDO BRUTO ES : " + sueldoBruto(ventas));
         
         System.out.println("-------------------------------------");
         System.out.println("DESCUENTO ES : " + descuento(ventas));
         
         System.out.println("-------------------------------------");
         System.out.println("EL SUELDO NETO ES : " +sueldoNeto(ventas));
       
         
    }
    
}
