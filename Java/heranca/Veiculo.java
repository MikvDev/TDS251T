/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.heranca;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Veiculo {
    public String marca;
    public int ano;
    

    public Veiculo(String marca, int ano) {
    this.marca = marca;
    this.ano = ano;
    }
    
    public void mover(){
        System.out.println("O veiculo está se movendo... vrum vrum");
    }
    
    

}
