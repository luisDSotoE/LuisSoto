/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PUNTO3;

import javax.swing.JOptionPane;

/**
 *
 * @author luisc
 */
public class PUNTPO3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double PrecioArticulo;
        double Iva;
        double utilidad;
        double precioventa;
        PrecioArticulo = 200.50;
        Iva = 19;
        utilidad = (PrecioArticulo * Iva / 100);
        precioventa = (PrecioArticulo+Iva+utilidad);
         
        System.out.println("El precio de venta es: "+precioventa);
        
        
        
        
    }
    
}
