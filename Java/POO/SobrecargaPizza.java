/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fundamentosjavasenac.POO;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
public class SobrecargaPizza {
    String sabor;
    boolean bordaRecheada;
    double preco;
    
    // VAMOS TRABALHA COM SOBRECARGAS DE CONSTRUTORES
    // constructor padrao sem parametro
    
    // vai construir uma pizza "vazia" apenas para mostrar que é possivel criar um ojeto sem definir nada;
    
    public SobrecargaPizza(){
        System.out.println("Pizza criada sem informações!");
    }
    // constructor recebendo apenas o sabor 
    public SobrecargaPizza(String sabor){
        this.sabor = sabor;
        this.preco = 60.00; // preco base padrao;
    }
    // constructor com sabor + borda recheada 
    public SobrecargaPizza(String sabor, boolean  bordaRecheada){
        this.sabor = sabor;
        this.bordaRecheada = bordaRecheada;
        this.preco = 60.00;
        if (bordaRecheada) {
            this.preco += 10.00; // pediu borda recheada? toma 10 reau;
            
            
        }
    }
        // 4 constructor com sabor + preco personalizado 
        // quando a pizaria do tds25psg1t  tem valores diferentes para sabores especiais
      public SobrecargaPizza(String sabor, double preco){
            this.sabor = sabor;
            this.preco = preco;
            
        }
      // metodo para exibir as informações da pizza 
      public void exebirInfo(){
          System.out.println("--------Pizzaria do TDS251T---------");
          System.out.println("Sabor:" + sabor);
          System.out.println("Borda recheada patrao? " + (bordaRecheada ? "sim" : "nao") );
          System.out.println("Preco: R$ " + preco);
          System.out.println("");
      }
    
}
