/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac;

import java.util.Scanner;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Retsuko {
    public static void main(String[] args) {
        Scanner verificar = new Scanner(System.in);
        
        System.out.println("Qual o nivel de estresse de Retsuko?");
        int estresse = verificar.nextInt();
        
        System.out.println("Que dia é hoje?");
        int dia = verificar.nextInt();
        System.out.println("Alguem gritou com voce?");
       
        boolean gritou = verificar.nextBoolean();
        
        
        
        if (dia == 5 && (estresse >= 70 || gritou == true ) )  {
            System.out.println("Retsuko entrou no modo Death metal!!! :0 ");
        }else{
            System.out.println("Retsuko esta de boa...");
        }
        
        
    }
}
