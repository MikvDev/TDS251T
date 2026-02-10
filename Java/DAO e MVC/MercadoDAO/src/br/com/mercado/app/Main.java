/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.mercado.app;

import java.util.Scanner;
import br.com.mercado.dao.ProdutoDAO;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        ProdutoDAO dao = new ProdutoDAO();
        
        System.out.println("==== Quantos produtos voce quer cadastrar? ====");
       
        int quantidade = sc.nextInt();
        sc.nextLine();
        
     
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("\n\n Digite o nome do Produto: ");
            String nome = sc.nextLine();
            
           
            System.out.println("Digite o preco do produto: ");
            
            int preco = sc.nextInt();
            
            sc.nextLine();
            System.out.println("Digite o setor do produto: ");
            
            String setor = sc.nextLine();
            
            System.out.println("Produto cadastrado");
            
            System.out.println();
            
            
        }
        
         
            
             
    }
}
