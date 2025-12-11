/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores.Private;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Homunculo {
    private String nome;
    private int nivelPerigo;
    
    
    
    // metodo get
    public String getNome(){
        return nome;
        
    }
    
    // setter (alterar valor com validação)
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getNivelPerigo(){
       return nivelPerigo;
    }
    public void setNivelPerigo(int nivel){
        if (nivelPerigo < 0 || nivel > 100) {
            System.out.println("Valor invalido");
        }else{
            this.nivelPerigo = nivel;
    }
        
    
}
}
