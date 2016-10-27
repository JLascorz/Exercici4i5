/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.iesjoaquimmir.geoapp.views.console;

import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Color;
import cat.iesjoaquimmir.geoapp.model.businesslayer.entities.Square;
import java.util.Scanner;
/**
 *
 * @author alumne
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner  input = new Scanner(System.in);
                int calcul = 0;
                      
        do{        
        System.out.println("Escoge (1. RGB, 2. HEXADECIMAL, 3. RANDOM, 4. RGB [MAYUS/MINUS]): ");
        calcul = input.nextInt();
        }while(calcul < 1 || calcul > 4);
     switch(calcul){        

       case 1:
           Rgb();
       break;

       case 2:
           Hexa();
       break;

       case 3:      
           Randum();
       break;

       case 4:      
           aMenor();
       break;
        }

    }
    
    public static void Rgb(){
        Scanner  input = new Scanner(System.in);
        int red=0, green=0, blue=0;
        //RED
        System.out.printf("Dime el color rojo: ");    
        red = input.nextInt();
        //BLUE
        System.out.printf("Dime el color verde: ");    
        green = input.nextInt();
        //GREEN
        System.out.printf("Dime el color azul: ");    
        blue = input.nextInt();
        
        Color co1 = new Color(red, green, blue);
        System.out.printf("RGB co1 -> r: %d g: %d b: %d %n",
            co1.getRed(), co1.getGreen(), co1.getBlue());
    }
    
    public static void Hexa(){
        Color co2 = Color.fromHexString("#7d7d7d");
                System.out.printf("HEX TRUE co2 -> %s %n", co2.toHexString(true));
                System.out.printf("HEX FALSE co2 -> %s %n", co2.toHexString(false));
                System.out.printf("HEX SOBRECARGA co2 -> %s %n", co2.toHexString());
    }
    
    public static void Randum(){
        Color co3 = Color.getRandom();
        System.out.printf("RGB co3 -> r: %d g: %d b: %d %n%n",
                co3.getRed(), co3.getGreen(), co3.getBlue());    
        System.out.printf("Colors creats: %d %n", Color.getCounter());
    }
    
    public static void aMenor(){
        Scanner  input = new Scanner(System.in);
        int red=0, green=0, blue=0;
        //RED
        System.out.printf("Dime el color rojo: ");    
        red = input.nextInt();
        //BLUE
        System.out.printf("Dime el color verde: ");    
        green = input.nextInt();
        //GREEN
        System.out.printf("Dime el color azul: ");    
        blue = input.nextInt();
        Color co4 = new Color (red, green, blue);
                System.out.printf("RGB TRUE co2 -> %s %n", co4.toRGBString(true));
                System.out.printf("RGB FALSE co2 -> %s %n", co4.toRGBString(false));
                System.out.printf("RGB SOBRECARGA co2 -> %s %n", co4.toRGBString());
    }
}
