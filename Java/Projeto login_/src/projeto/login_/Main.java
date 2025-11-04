/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto.login_;

/**
 *
 * @author MIGUELVARGASFERREIRA
 */
 //ctrl + espaço 
    // alt insert!!!! muito bom
    // alt shift f arrumar codigo
// ctrl f6 rodar
// ctrl + 2 barra lateral
public class Main {
    public static void main(String[] args) {
        
    Mamifero meuMamifero = new Mamifero("Rosa", "Pantera ", 60);
    Reptil meuReptil = new  Reptil("Verde","anaconda", 300);
        System.out.println(meuMamifero.mostrarRacaEPeso());
        System.out.println(meuReptil.mostrarRacaEPeso());
        
        System.out.println(meuMamifero.fazerSom());
        System.out.println(meuReptil.fazerSom());
    }
//         Pessoa MinhaPessoa = new Pessoa("Miguel", 18);
//        MinhaPessoa.fraseIdade();
//        MinhaPessoa.meuMetodo();
//        
//        Pessoa.meuMetodo(); // não pega nenhuma informação
//
//Calculadora calc3 = new Calculadora(8,2); // 0 da problema;
////       System.out.println("Somar:");
//        System.out.println(calc3.somar());
////        
//        double soma = calc3.somar();
//        System.out.println("outro jeito, variavel soma:" + soma);
//        System.out.println("------------------");
//        System.out.println("Diminuir:");
//        System.out.println(calc3.subtrair());
//        
//        System.out.println("------------------");
//        System.out.println("Dividir:");
//        System.out.println(calc3.dividir());
//        
//        
//        System.out.println("-------------------");
//        System.out.println("Multipicar:");
//        System.out.println(calc3.multiplicar());
//        
//double soma = calc3.somar();
//
//Animal animal = new Animal("tatu", 7);
//        System.out.println(animal.mostrarRacaEPeso());
//
//    }


}
