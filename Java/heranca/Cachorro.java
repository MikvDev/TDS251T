/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.heranca;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */

public class Cachorro extends Animal {

    String raca;
    public Cachorro(String nome, int idade, String raca){
        super(nome, idade);
        
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Au Au! ");
    }
    
    public void correr(){
        System.out.println(nome + " está correndo atras de moto!");
    }
}
