function escolherPersonagem(escolhaDePersonagem){
    if(escolhaDePersonagem === "guerreiro"){
       let opcao = parseFloat(prompt("Qual seu nivel"))
       if(opcao >= 50){
        alert(`Você é um guerreiro lendario!`)
       }
       if(opcao < 50){
        alert(`Você precisa melhorar seu personagem. Continue subindo de nivel!!`)
       }
    }else if( escolhaDePersonagem === "mago") {
        let opcao = parseFloat(prompt("Qual seu nivel?"))
        if(opcao >= 50){
            alert(`Você é um guerreiro lendario!`)
        }
           if(opcao < 50){
            alert(`Você precisa melhorar seu personagem. Continue subindo de nivel!!`)
        if((opcao < 50) && (opcao > 70)){
                alert(`Você precisa melhorar seu personagem. Continue subindo de nivel!!`)
               }
          
           
    }else if( escolhaDePersonagem === "arqueiro"){
        let opcao = parseFloat(prompt("Qual seu nivel?"))
        if(opcao > 50 ){
            alert(`Que pena, seu nivel é muito baixo!`)
        }
        if(opcao >= 50){
            alert(`Você é um guerreiro lendario!`)
           }
          else if((opcao < 50) && (opcao > 70)){
            alert(`Uau! Você está muito avançado, continue assim!`)
           } 
          else if((opcao > 70) && (opcao > 70)){
            alert(``)
           }
        
     }  
    }else if( (escolhaDePersonagem != "arqueiro")&&(escolhaDePersonagem != "mago")&&(escolhaDePersonagem != "arqueiro")){
        alert(`Classe não entendida, tente novamente!!`)
    }
}

let escolha = prompt("Digite seu personagem!")
escolherPersonagem(escolha)

// obs: podia ter pedido antes o level do jogador e a classe em vez de fazer uma mistureba de if