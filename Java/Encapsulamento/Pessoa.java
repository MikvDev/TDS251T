/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Encapsulamento;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Pessoa {
    // Private dados - > protegidos 
    private String nome;
    private int idade;

    
    public Pessoa(String nome, int idade) {
    setNome(nome);
    setIdade(idade);
}
    // getter -> peça o valor 
    public void setNome(String nome){  
        if (nome == null || nome.isBlank()) {
            System.out.println("Nome invalido");
        }else{
            this.nome = nome;
           
        }
    }
    public String getNome(){
    return nome;
}
    public void setIdade(int idade){
        if (idade < 0 || idade > 120) {
             System.out.println("idade inválida!");
        
           
        }else{
            this.idade = idade;
           
    }
    
}
    public int getIdade(){
        return idade;
    }
}
