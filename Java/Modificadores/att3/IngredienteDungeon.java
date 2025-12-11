/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores.Default;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class IngredienteDungeon {
    void usar(String nome){
       
        
        if (nome.equals("sidney")) {
            System.out.println("UIIIII! treco ruim.. a comida não ficou boa :(");
        }else{
             System.out.println("Voce usou os ingredientes: " + nome + " para preparar a receita! ficou muito bom :) ");
        }
    }
}
