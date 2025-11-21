/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.varPrimitivasEReferencias;

import java.util.Scanner;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Att {
    public static void main(String[] args){
        // achar a 1 letra de uma palavra
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma palavra");
        
        
        String palavra = sc.nextLine();
        
        char primeira = palavra.charAt(0);
        char segunda = palavra.charAt(1);
        char ultima = palavra.charAt(palavra.length() - 1);
        System.out.println("Primeira letra da palavra e " + primeira);
        System.out.println("A segunda letra da palvra e " + segunda);
        System.out.println("A ultima letra e " + ultima);
    }
}
