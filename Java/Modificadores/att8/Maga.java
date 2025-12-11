/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.Modificadores.att8.Private;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class Maga {
    private int mana;
    
    
    public void setMana(int mana){
        if (mana > 0 && mana < 10000) {
            this.mana = mana;
            System.out.println("Mana atualizada!");
        }else{
            System.out.println("Numero invalido!");
        }
            
        
    }
    public int getMana(){
        return mana;
    }
}
