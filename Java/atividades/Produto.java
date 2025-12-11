/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Produto {
    String nome;
    int codigoDoProduto;
    char categoria;
    int quantidade;

    public Produto(String nome, int codigoDoProduto, char categoria, int quantidade) {
        this.nome = nome;
        this.codigoDoProduto = codigoDoProduto;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }
    
    public   void mostrardados(){
        System.out.println("Nome do produto: " + nome + ", codigo: " + codigoDoProduto + " categoria: " + categoria + ". Existem: " + quantidade + " no estoque");
        
}
}
