/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PUNTO4;

import java.util.Scanner;

/**
 *
 * @author luisc
 */
public class PUNTO4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numdiasviaje, ttkmconxdia, pagoxestacxdia, pagopeaxdia;
        double gasolina = 3000;
        double kmxlitro = 10;
        double costgaso;
        double costotal;
        System.out.print("Cuantos días de viaje tuvo: ");
        numdiasviaje = sc.nextDouble();
        System.out.print("Cual fue su total de kilometros conducido por dia: ");
        ttkmconxdia = sc.nextDouble();
        System.out.print("Pago por estacionamiento: ");
        pagoxestacxdia = sc.nextDouble();
        System.out.print("Pago de peajes por dias: ");
        pagopeaxdia = sc.nextDouble();
        
        costgaso = (ttkmconxdia*numdiasviaje)/kmxlitro;
        costotal = (costgaso * gasolina) + (pagoxestacxdia * numdiasviaje) + (pagopeaxdia * numdiasviaje);
        
        System.out.println("El costo total del viaje es: "+costotal);
    
}
}
