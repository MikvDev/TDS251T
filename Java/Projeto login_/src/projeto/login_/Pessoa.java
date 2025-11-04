/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.login_;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */

    public class Pessoa {
    
    // atributos!
    
    private String nome;
    private int idade;
    
    // constructor
    // substitui o constructor!!!
    Pessoa(String nome,int idade){
    this.nome = nome;
    this.idade = idade;
    }
    
    
    
    public static void meuMetodo(){ // atributo vem antes! void... // quando não pega atributos do objeto pode usar static
        System.out.println("Ola");    
    }
    public void fraseIdade(){ // Aqui não usa static, pega atributos do objeto
    // USE "SOU" 
   
    
        System.out.println("Pessoa esta falando! " + this.nome + " tem " + this.idade );
        
        
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
   
    
    }
   


