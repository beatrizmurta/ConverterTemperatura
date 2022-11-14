/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package converter.temperatura;
import java.util.Scanner;
/**
 *
 * @author Beatriz Murta
 */
public class ConverterTemperatura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
        double c, k, re, ra, f;
        String converter;
        Scanner ler = new Scanner (System.in);
        
        System.out.println("Qual a temperatura em celsius? ");
        c = ler.nextDouble();
      
        k = c + 273.15;
        re = c * 0.8;
        ra = c * 1.8 + 32 + 459.67;
        f = c * 1.8 + 32;
        
        System.out.println("Gostaria de converter para Kelvin, Reaumur, Rankine ou Fahrenheit? ");
        converter = ler.next();
        
        if (converter.equals("Kelvin")){
            System.out.println("A temperatura em Kelvin é: " +k);
        }else{
            if (converter.equals("Reaumur"))
                System.out.println("A temperatura em Reaumur é: " +re);
            else{
                if (converter.equals("Rankine"))
                System.out.println("A temperatura em Rankine é: " +ra);
                else{
                    if (converter.equals("Fahrenheit"))
                    System.out.println("A temperatura em Fahrenheit é: " +f);
                }
            }
        }
    }    
}
