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
public class CEjercicio06 {
    public static void main(String[] args) {
        Scanner teclado =new Scanner(System.in);
        double pasajeDia,pasajeNoche,descunetoOcho,descuentoCinco,cantidadPasajeros;
       
        pasajeDia=37.5;
        pasajeNoche=37.5;
        
        System.out.println("DIME LA CANTIDAD DE BOLESTAS : ");
        cantidadPasajeros=Double.parseDouble(teclado.next());
        System.out.println("LA CANTIDAD DE BOLETOS COMPRADOS ES : " +
                cantidadPasajeros);
        
        if(cantidadPasajeros >=15){
            System.out.println("EL DESCUENTO DE " + cantidadPasajeros + " " + "pasajeros es : "
                    + (cantidadPasajeros * pasajeDia)*0.08 + " ");
        }else if(cantidadPasajeros < 15){
            System.out.println("EL DESCUENTO DE " + cantidadPasajeros + " " + "pasajeros es : "
            + (cantidadPasajeros * pasajeDia)*0.05 + " ");
        }
    }
}
