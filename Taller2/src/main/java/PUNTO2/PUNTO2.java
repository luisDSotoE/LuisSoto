/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package PUNTO2;

/**
 *
 * @author luisc
 */
public class PUNTO2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x = 41.23d;
        double y = 30.15d;
        double z = 26.31d;
        double suma = (x+y+z); //calcula la suma
        double promedio = (x+y+z)/3; //calcula la promedio
        double producto = (x*y*z); //calcula el producto
        double cociente = (x+y/z); //calcula el cociente
        double modulo = (x%y%z); //calcula el modulo
        suma = Math.round(suma * 100) / 100d;
        System.out.println(suma); //
        promedio = Math.round(promedio * 100) / 100d;
        System.out.println(promedio);
        producto = Math.round(producto * 100) / 100d;
        System.out.println(producto);
        cociente = Math.round(cociente * 100) / 100d;
        System.out.println(cociente);
        modulo = Math.round(modulo * 100) / 100d;
        System.out.println(modulo);
    }
}  
