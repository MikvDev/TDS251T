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
public class Frieren {
    public static void main(String[] args){
        Scanner verificar = new Scanner(System.in);
        
        System.out.println("Qual o nivel de sua mana atual:");
         
        System.out.println("Quantos metros esta o inimigo?");
//        int metros = verificar.nextInt();
//        if (mana < 20 || metros < 5) {
//            System.out.println("Você não pode usar sua magia proibida!!!");
//         
//        }else if ( mana != 20 || metros != 5) {
//            System.out.println("Voce pode usar a magia  proibida...  :0 !! ");
//        }
//        verificar.close();
int distancia = verificar.nextInt();
boolean manaBaixa  = mana < 20;
boolean inimigoPerto = distancia < 5;
boolean condicaoPerigosa = manaBaixa || inimigoPerto;  

boolean podeUsar = !condicaoPerigosa;
        System.out.println("Frieren pode usar magia proibida? " + podeUsar);
        verificar.close();
        
        
    }
}
