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
public class SpyXFamily {
    public static void main(String[] args){
        
        Scanner verificar = new Scanner(System.in);
        
        
        System.out.println("Qual a nota da sua ultima entrevista?");
        double notaEntrevista = verificar.nextDouble();
        
        if( notaEntrevista >= 9.0){
            System.out.println("Elegante :-0");
        }else if (notaEntrevista >= 7.0) {
            System.out.println("Aprovado pela Eden academy!");
        }else if (notaEntrevista < 7.0 ){
            System.out.println("Anya faz cara triste.. ");
        }
            verificar.close();
    }
}
