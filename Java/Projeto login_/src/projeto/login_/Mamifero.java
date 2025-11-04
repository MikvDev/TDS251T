/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.login_;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Mamifero extends Animal{
    // ela vai herdar tudo da outra classe
    private String corDoPelo;

    public Mamifero(String corDoPelo, String raca, int peso) {
        super(raca, peso); // superClasse, chama o classe pai
        this.corDoPelo = corDoPelo;
    }
    
@Override 
public String fazerSom(){
    return this.raca + "esta fazendo um som alto!";
}
    
}
