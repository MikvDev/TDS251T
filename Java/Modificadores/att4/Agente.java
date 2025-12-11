/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Agente {
    
    public void executarMissao(){
        System.out.println("Missao em andamento..");
    }
    // metodo publico com retorno
    public int calcularSigilo(int base, int missao){
        return base + missao;
    }
    public void apresentar(String codinome){
         System.out.println("Agente identificado como: " + codinome);
         
     }
    
   
}
