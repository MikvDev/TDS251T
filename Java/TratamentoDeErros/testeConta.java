/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.TratamentoDeErros;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class testeConta {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.sacar(1000);
        } catch (Exception e) {
            System.out.println("Tratando erro! : " + e.getMessage());
        }finally {
            System.out.println("Programa finalizado! Precisa de dinhero ? faz o L ai patrao.");
        }
        
    }
}
