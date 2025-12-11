/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Encapsulamento;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Pessoateste {
    public static void main(String[] args) {
            Pessoa p1 = new Pessoa("Sidneia", 92);
            System.out.println("Nome "  + p1.getNome());
            System.out.println("Idade " + p1.getIdade());
            
            
            p1.setNome("");
            p1.setIdade(170);
            System.out.println("Nome final " + p1.getNome());
            System.out.println("Idade final " + p1.getIdade());
    }

    
}
