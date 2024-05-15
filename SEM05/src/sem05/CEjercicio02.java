/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sem05;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class CEjercicio02 {
    static Scanner teclado=new Scanner(System.in);
    private static String leerNombre(){
        String nom;
        System.out.println("Ingrese nombre del cliente: ");
        nom=teclado.nextLine();
        return nom;
    }
    private static int tipoAuto(){
        int tipoAuto;
        System.out.println("Seleccione el tipo de auto:");
        System.out.println("t[1]Pequeno (s/.15.00/dia + s/.0.20/km)");
        System.out.println("t[2]Mediano (s/.20.00/dia + s/.0.30/km)");
        System.out.println("t[3]Grande (s/.30.00/dia + s/.0.40/km)");
        
        System.out.println("Ingrese Opcion[1,2 o 3] :");
        tipoAuto= teclado.nextInt();
        return tipoAuto;
    }
     private static int diasAlquiler(){
         int  diasAlquiler;
         System.out.println("Ingrese los dias de alquiler");
         diasAlquiler= teclado.nextInt();
         return diasAlquiler;
     }
     private static float kmRecorridosDia(){
         float kmRecorridosDia;
         System.out.println("Ingrese la cantidad de km recorrido ´por dias: ");
         kmRecorridosDia=teclado.nextFloat();
         return kmRecorridosDia;
     }
     private static double getRuningToDays(int tipoAuto){
         switch (tipoAuto) {
             case 1:
                 return 15.0;
             case 2:
                 return 20.0;
             case 3:
                 return 30.0;
             default:
                 System.out.println("Este tipo de auto no existe");
                 return 0.0;
         }
     }
     private static double getPrice(int tipoAuto,float kmRecorridosDia){
         switch (tipoAuto) {
             case 1:
                 return 0.2 * kmRecorridosDia;
             case 2:
                 return 0.3 * kmRecorridosDia;
             case 3:
                 return 0.4 * kmRecorridosDia;
                 
             default:
                 return 0.0;
         }
     }
     private static double getFRecargoKM(float kmRecorridosDia){
         if(kmRecorridosDia > 10){
             return 0.025;
         }else{
             return 0.0;
         }
     }
     private static String typeAutoToString(int tipoAuto){
         switch (tipoAuto) {
             case 1:
               return "pequeno";
             case 2:
                 return "Mediano";
                 
             case 3:
                 return "Grande";
                 
             default:
                 return "Desconocido";
         }
     }
     private static float calcularCostoDia(int tipoAuto,float kmRecorridosDia,
             int diasAlquiler){
         float costoDiario,costoTotalkm,recargokm;
         costoDiario=(float)getRuningToDays(tipoAuto);
         costoTotalkm=(float)getPrice(tipoAuto, kmRecorridosDia);
         recargokm=(float)getFRecargoKM(kmRecorridosDia);
         return (float) (costoDiario + costoTotalkm + recargokm * diasAlquiler);
         
     }
     private static double montoTotal(float kmRecorridosDias ,
             int diasAlquiler){
         float costoDiario,costoTotalkm,recargokm;
         return diasAlquiler  * getRuningToDays(diasAlquiler)+ (kmRecorridosDias + getPrice(diasAlquiler, kmRecorridosDias));
     
     }
     private static void imprimir(String nom,float tipoAuto,int diasAlquiler,float costoTotalDia){
         String rojo="";
         String azul="";
         System.out.println(rojo + "------------------------REPORTE-----------------------------");
         System.out.println("CLIENTE : "+  nom);
         System.out.println("TIPO DE AUTO : "+ typeAutoToString((int) tipoAuto));
         System.out.println("DIAS ALQUILER : " + diasAlquiler);
         System.out.println("Costo toal por dia : " +  costoTotalDia);
         System.out.println("Costo totl a pagar : " + montoTotal(costoTotalDia, diasAlquiler));
         System.out.println(rojo + "-------------------------------------------------------------");
     }
     public static void main(String[] args) {
         String nombre;
         int tipoA,diasAlquiler;
         float kmRecorridosDia,costoTotalDia, totalMonto;
         System.out.println("-------------------Ingreso de Datos---------------------------------");
         nombre=leerNombre();
         tipoA=tipoAuto();
         diasAlquiler=diasAlquiler();
         kmRecorridosDia=kmRecorridosDia();
         costoTotalDia=calcularCostoDia(tipoA, kmRecorridosDia,diasAlquiler);
         imprimir(nombre,tipoA,diasAlquiler, costoTotalDia);
         
    }
}
