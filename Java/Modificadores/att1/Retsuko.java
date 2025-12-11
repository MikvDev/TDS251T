/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Retsuko {
    public void cantarMetal(String cantar){
        if (cantar == null || cantar.isBlank() ) {
            System.out.println("invalido!");
        } 
        try {
           
            
        } catch (Exception e) {
        }
         
        System.out.println("Voce cantou metal! : " + cantar);
    }
    public void estado(int estresse){
        if (estresse > 50) {
            System.out.println("TO MUITO ESTRESSADO!!!!");
        }else{
            System.out.println("To na paz! to de boa irmao...");
        }
    }

}
