/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.varPrimitivasEReferencias;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class TamanhoString {
    public static void main(String[] args) {
        String palavra = "computador";
        int tamanho = palavra.length();
        System.out.println("");
        
        
        
        // acessar um caracter possicao
        
        char primeira = palavra.charAt(0);
        char segunda = palavra.charAt(1);
        char ultima = palavra.charAt(palavra.length() - 1);
        System.out.println(ultima);
    }
}
