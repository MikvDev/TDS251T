/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.condicionais;

import java.util.Scanner;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class SpyXFamily2 {
    public static void main(String[] args) {
        Scanner verificar = new Scanner(System.in);
        
        
        System.out.println("Digite o numero");
        int num = verificar.nextInt();
               switch(num) {
            case 1:
                System.out.println("Missao proteger ANYA!");
                break;
            case 2:
                System.out.println("Missao investigar Desmond");
                break;
            case 3:
                System.out.println("Missao secreta SSS");
                break;
            case 4:
                System.out.println("Visitar o castelo para recreacao");
                break;
            default:
                System.out.println("Missao descinhecida...");
                throw new AssertionError();
        }
    }
              
}
