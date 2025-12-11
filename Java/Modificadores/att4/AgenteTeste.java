/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class AgenteTeste {
    public static void main(String[] args) {
        Agente a = new Agente();
        a.executarMissao();
        a.apresentar("twillgth");
        
        int sigilo = a.calcularSigilo(5, 3);
        
        System.out.println("Sigilo total: " + sigilo);
        
    }
}
