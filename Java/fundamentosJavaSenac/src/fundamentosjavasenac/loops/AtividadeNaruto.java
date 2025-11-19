/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.loops;

import java.util.Scanner;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */


public class AtividadeNaruto{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

      
        int vida = 100;
        int danoinimigo = 20; 
        int danoJogador = 14;

       
        System.out.println("Quantos inimigos voce quer enfrentar? (1 a 5)");
        int qntdInimigos = sc.nextInt();

       
        while (qntdInimigos < 1 || qntdInimigos > 5) {
            System.out.println("Valor inválido! Digite entre 1 e 5: ");
            qntdInimigos = sc.nextInt();
        }

        int inimigoAtual = 1;
        
        while (inimigoAtual <= qntdInimigos && vida > 0) {
           
            int vidaInimigo = 40;
            System.out.println("\n--- A Batalha " + inimigoAtual + " Comeca! ---");
            System.out.println("Sua vida: " + vida + " | Vida do inimigo: " + vidaInimigo);
            
            while (vidaInimigo > 0 && vida > 0) {
                
            
                System.out.println("\n(1) Atacar - (2) defesa");
                int acao = sc.nextInt();
                if (acao == 1) {
                     System.out.println(" Voce ataca! Causa " + danoJogador + " de dano.");
                    vidaInimigo -= danoJogador;
                    vida -= danoinimigo;
                      
                }else if (acao == 2) {
                    System.out.println("Voce defendeu! dano do imigo divido pela metade..");
                    int danoNerfado = danoinimigo / 2;
                    vida -= danoNerfado;
                }
              
                if (vida > 0 && vidaInimigo > 0) {
                    System.out.println("Status: Sua vida: " + vida + " | Vida do inimigo: " + vidaInimigo);
                }
            }

            if (vida > 0) {
                System.out.println("\n Você derrotou o inimigo " + inimigoAtual + "!");
            }

            inimigoAtual++; 
        }
        
        if (vida > 0) {
            System.out.println("Aprovado no Exame Chunin!" + (inimigoAtual - 1) + " inimigos!");
        } else {
            System.out.println("Você foi derrotado... Reprovado!");
        }
    }
}
       
    

