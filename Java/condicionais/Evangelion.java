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
public class Evangelion {
    public static void main(String[] args) {
        Scanner verificar = new Scanner(System.in);
        System.out.println("Digite o nivel de sincronizacao do piloto:");
        int nivel = verificar.nextInt();
        
        if (nivel < 40) {
            System.out.println("Sincronizacao insuficiente - unidade não pode ser ativa");
        }else if (nivel > 40 && nivel < 79) {
            System.out.println("Sincronizacao estavel - piloto em nivel aceitavel de sincronia com o EVA");
        }else if (nivel >= 80 ) {
            System.out.println("Sincronizacao maxima - risco de EVA entrar em descontrole");
        }
}
}
