/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.heranca;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Animal {
    String nome;
    int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    public void dormir()
    {
        System.out.println(nome + " está dormindo..."); 
    }
    public void emitirSom(){
        System.out.println("Som genérico do animal");
        
    }
           
}
