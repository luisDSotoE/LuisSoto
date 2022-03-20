/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PUNTO5;

import java.util.Scanner;

/**
 *
 * @author luisc
 */
public class PUNTO5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double manzana = 52;
        double pera =  55;
        double naranja = 45;
        double melon = 54;
        double piña = 55;
        double fresa = 32;
        double cantidadmanzana;
        double cantidadpera;
        double cantidadnaranja;
        double cantidadmelon;
        double cantidadpiña;
        double cantidadfresa;
        double Calorias;
        
        
        System.out.print("Cuantos manzanas te comeras?: "); 
        cantidadmanzana = sc.nextDouble();
        System.out.print("Cuantos peras te comeras?: "); 
        cantidadpera = sc.nextDouble();
        System.out.print("Cuantos naranja te comeras?: "); 
        cantidadnaranja = sc.nextDouble();
        System.out.print("Cuantos melon te comeras?: "); 
        cantidadmelon = sc.nextDouble();
        System.out.print("Cuantos piña te comeras?: "); 
        cantidadpiña = sc.nextDouble();
        System.out.print("Cuantos fresa te comeras?: "); 
        cantidadfresa = sc.nextDouble();
        
        Calorias = ((manzana * cantidadmanzana)+ (pera * cantidadpera) + (naranja * cantidadnaranja)+ (melon * cantidadmelon )+(piña *cantidadpiña)+(fresa *cantidadfresa));
        System.out.println("El total de calorias son: "+Calorias);
    }
    
}
