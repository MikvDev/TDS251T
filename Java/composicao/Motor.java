/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.composicao;

/**
 *
 * @author MIGUELVARGASFERREIRA
 * 
 */
public class Motor {
    //////////// Referencia para o carro ao qual este motor pertence;
    final Carro carro;
    //indica se o motor esta ligado
    boolean ligado = false;
    
    //Representando a quantidade de combustivel sendo injetada ;
    double fatorInjecao = 1;
    public Motor(Carro carro){
    this.carro = carro;
   // Aqui o constructor do motor sabe qual Carro ele pertence;
}
    // metodo que calcula e retorna a rotção (RPM) do motor;
int giros(){
    if(!ligado){
    // se o motor não estiver ligado...;
    return 0;
}else{
         return(int) Math.round(fatorInjecao * 3000);
         // calcular os giros multiplicando o fator de injeção;
         // Math.round() arredonda o valor;
}
}
}
