/*
Yuri Resende Corrêa - 20157082
 */
package Desafio;

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        
        int ho, ve, x, y;
        
        Scanner scan = new Scanner (System.in);
        
        System.out.print("Coluna da Torre: ");
        ve = scan.nextInt();
        System.out.print("Linha da Torre: ");
        ho = scan.nextInt();
        
        System.out.println("\n      1    2    3    4    5    6    7    8");
        System.out.print("   ---------------------------------------\n");
        for (x = 1; x <= 8; x++){
            System.out.printf(" %d |", x);
            for (y = 1; y <= 8; y++){
                if (x != ho && y != ve){
                    System.out.print("  -  ");
                }else{
                    System.out.print("  x  ");
                }
                if (y == 8){
                    System.out.print("\n");
                }
            }
        }
    }
}
