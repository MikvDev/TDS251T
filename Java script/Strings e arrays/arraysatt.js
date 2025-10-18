// Dia 11.06
// shift() remove o primeiro, unshift adiciona por primeiro. push adiciona o ultimo e pop() remove o ultimo 

// att 

//lista 

let listaDeCachorros = ["De rua", "Pitbull","Chihuahua", "Pastor alemão","Salsicha"]; // indice 0 1 2 3 4 5 6 7 ...

// imprimir a primeira 
// console.log('------------------------------------');
// console.log(listaDeCachorros[1]);
// console.log('------------------------------------');


// template string 
// console.log('------------------------------------');
// console.log(`A raça de primeira posição é ${listaDeCachorros[2]}`);
// console.log('------------------------------------');

// console.log('------------------------------------');
// console.log(`A raça de primeira posição é ${listaDeCachorros[4]}`);
// console.log('------------------------------------');


// concatenação 
// console.log('------------------------------------');
// console.log("A raça de primeira posição é " + listaDeCachorros [2]);
// console.log('------------------------------------');

// console.log("A raça de primeira posição é " + listaDeCachorros [0])


//lista de roupas 

let listaDeRoupas = 
[
 "Chinelo",// 0   
 "Bermuda",//1
 "cueca",//2
 "Camisa social",//3
 "Calça social",//4
 "jeans",//5
 "tenis",//6
 "Tenis branco",//7
 "Camisa preta",//8
 "Calça moletom",//9
 "Camisa moletom",//10
 "Calça cargo",//11
 "Meias",//12
 "Relogio",//13
 "Oculos", //14
 "Camisa de banda de rock ",//15 
 "Brinco",//16
 "Camisa xadrez vermelha",
 "Camisa branca "

 
]

// ]
// console.log('-Look para um passeio no parque.:');
// console.log(listaDeRoupas[2],listaDeRoupas[1],listaDeRoupas[8], listaDeRoupas[0]);
// console.log('------------------------------------');




// console.log('-Look para uma entrevista de emprego.:');
// console.log(listaDeRoupas[2], listaDeRoupas[6], listaDeRoupas[12], listaDeRoupas[3], listaDeRoupas[5], listaDeRoupas[13]);
// console.log('------------------------------------');


// console.log('------------------------------------');
// console.log();
// console.log('------------------------------------');



// console.log('-Look para um show a noite.:');
// console.log(listaDeRoupas[2], listaDeRoupas[7], listaDeRoupas[12], listaDeRoupas[11], listaDeRoupas[15], listaDeRoupas[13], listaDeRoupas[16]);
// console.log('------------------------------------');



// console.log('-Look para ficar em casa assistindo filmes.:');
// console.log(listaDeRoupas[2],listaDeRoupas[9],listaDeRoupas[10]);
// console.log('------------------------------------');



// console.log('Look para festa Junina no Senac.:');
// console.log(listaDeRoupas[2],listaDeRoupas[5],listaDeRoupas[17], listaDeRoupas[18], listaDeRoupas[12], listaDeRoupas[6]);
// console.log('------------------------------------');



const guardaRoupa = [


    "vestido",
    "camisa de banda ",
    "pijama",
    "salto",
    "cacaco",
    "tenis",
    "calça jeans",
    "terno",
]

//console.log(`Meu guarda roupa é composto pelas peças.: ${guardaRoupa}`);



let lookParque = [ guardaRoupa[2], guardaRoupa[3], guardaRoupa[6] ]
// console.log("============================================")
// console.log(`Meu look para ir no parque é.: ${lookParque}`)


// console.log()


// contar um array

//console.log(lookParque.length)


//Atividade 


// let lanchesHomer =
//  [
//     "rosquinha",
//     "rosquinha",
//     "rosquinha", 


// ]

// let lanchesScooby =
//  [
//     "Hamburguer", 
//     "Batata frita",
//      "milkshake", 
//      "Biscoito scooby",
//      "Pizza"

//  ]

//  let lanchesBobEsponja =  
//  [
//     "Hamburguer de Siri",
//     "Refri",
//     "Batata",
//     "Sorvete",
//     "Molho secreto"
//  ]

//  let lanchesMagali = 
// [ 
//     "melancia",
//     "banana",
//     "abacate",
//     "banana"
// ]
    
// console.log(`A quantidade de itens do scooby é.:${lanchesScooby.length}`)
// console.log(`A quantidade de itens do Homer é.:${lanchesHomer.length}`)
// console.log(`A quantidade de itens da Magali é.:${lanchesScooby.length}`)
// console.log(`A quantiadade de itens do Bob esponja é.:${lanchesBobEsponja.length}`)

// const seriesBoas = ["Breaking Bad", "Brooklyn Nine-nine"]
// console.log(seriesBoas.includes("Breaking Bad"))
// console.log(seriesBoas.includes("Game of Thrones"))


// // incluedes verifica se o indice esta presente no array
// const pokemonsCapturados  = 
// [
//     "Pikachu",
//     "Charmander",
//     "Bulbasaur",
//     "squirtle",

// ]

// console.log(pokemonsCapturados.includes("Pikachu"))
// console.log(pokemonsCapturados.includes("Meowth"))

// Metodo Push 

// const numeros =
// [
//     1,2,3
// ]
// numeros.push(4)

// console.log(numeros)


// numeros.push(5,6,7)

// console.log(numeros)

//Atividade

// const listaDeCompras = [" arroz","Feijão","macarrão" ]


// listaDeCompras.push("leite","farinha","banana","canela","frango","margarina","farofa")

// console.log(` A lista de compras ficou assim.:${listaDeCompras}`)



// Dia 13.06
// Metodo unshift adiciona elementos no inicio invés do push que adiciona ao final!

let cores = ["azul", "verde"]
cores.unshift("vermelho")
//console.log(cores)

// shift() remove o primeiro item da lista 


//var 

let listaComMarcasDeCelular = [
    "Apple",
    "Positivo",
    "Sansung",
    "Xiaomi"
]
// Atividade

// console.log('=======================================');
// console.log(" 📰 - Lista De celulares 📱.:");
// console.log(listaComMarcasDeCelular);
// console.log('=======================================');
// console.log('');
// console.log("Nova entrega com unshift 📦📫");
// console.log('');
// listaComMarcasDeCelular.unshift("Motorola")
// console.log('========================================');
// console.log(" ✨ Um celular foi adicionado na frente da lista 📱.:");
// console.log(listaComMarcasDeCelular);
// console.log('========================================');

// // shift() remove o primeiro elemento do array

// console.log('');
// console.log("shift levou o primeiro item da lista 🛒!");
// listaComMarcasDeCelular.shift()
// console.log('');

// console.log("=======================================");
// console.log("A lista ficou assim.:");

// console.log('=======================================');
// console.log(" 📰 - Lista De celulares 📱.:");
// console.log(listaComMarcasDeCelular);
// console.log('=======================================');

let listaDeCidades = [
    "São Leopoldo",
    "Novo Hamburgo",
    "Sapucaia"
]
// console.log(listaDeCidades)
// console.log('=======================================');
// console.log("Removendo uma cidade com shift() ⚒️👷🏻🚧");
// console.log('=======================================');
// listaDeCidades.shift()


// console.log(listaDeCidades)


// Metodo pop() apaga o ultimo elemento  de um array!!

const meusPeixes = [
    "palhaço",
    "mandarim",
    "esturjão"
]
// console.log('A 3 peixes no aquario 🐟🐠🐡');
// console.log(meusPeixes);
// console.log('°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°');
// console.log()
// meusPeixes.pop()
// console.log("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°")
// console.log(' Metodo pop Pescou um peixe 😢🎣!!');
// console.log(meusPeixes);
// console.log('°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°');


//Atividade

//var 

let listaDetarefas = [
    "Limpar a casa",
    "Lavar a louça",
    "Fazer comida",
    "Ler",
    "Estudar"
]
// console.log("///////////////////////////////////////////////////////////")
// console.log("--------------------------tarefas-----------------------")
// console.log(listaDetarefas)
// // mostrando todas as tarefas 

// console.log('//////////////////////////////////////////////////////////');
// console.log();
// console.log('/////////////////////////////////////////////////////////');
// console.log(`A tarefa que foi concluida foi ${listaDetarefas[4]} `)
// listaDetarefas.pop()
// console.log(listaDetarefas)

const letras = [ 
    "A",// 0 
    "B",// 1
    "C",// 2 
    "D",// 3 
    "E",// 4 
    "F",// 5 
    "G",// 6 
    "H"// 7 
]
// Da array letras, na posição 2("C") remove 1 (o propio c)

// Da arary letras, posição 3 ("D") remove 2 (E e F)
//console.log(letras) 

//letras.splice(3,2)
//console.log(letras)

//letras.splice(3,2)
//console.log(letras)


// Atividade
// Obs :
// Criando o baralho 

let deck = [
    "Pikachu", "Charmander","Bulbasaur","Pikachu","Squirtle","Meowth"
]
deck.splice(3,1)
// Removendo o Pikachu
deck.splice(3,0,"Snorlax" ) // tira o Pikachu e adiciona um novo pokemon -- tudo em uma linha 

//console.log(deck)
// Aqui nos podemos utilizar o slice para adicionar tbm... porem utitilizando o 0 na sintaxe aquela logo, logo:
// Splice (i,n) ---> A partir/na posição i retiro n elementos 
// Quando usamos o 0 no lugar do n - sinalizamos que não estamos tirando nada ... então ele adiciona

//deck.slice(3,0,"Snorlax") // da posição 3 adiciona um novo elemento
// console.log(deck)

deck.splice(5,1, "Eeevee" )
// console.log(deck)


// Metodo concat()

let frutas2 = [
    "maca","banana"
]
let legumes = [
    "cenoura","Batata"
]
let alimemtos = frutas2.concat(legumes) // Criando uma nova variavel e concatenando 2 arrays 
// console.log(alimemtos)

// voce abruiu 3 pactes de cartas pokemon  e cada umn veio com um conjunto diferenrte de cartsaa 

let pacote1 = [
    "Pikachu","Bulbasauro","charmander"
    ]
    let pacote2 = [
    "Squirtle","Jigglypuff"
    ]
    let pacote3 = [
    "meowth","Snorlax","Eevee"
    ]
    
    // juntando todas as arrays
    
    // let  novaLista = pacote1.concat(pacote2, pacote3)
    // console.log(`Os pokemons no pacote são: ${novaLista}`)
    // console.log(`A quantidade de cartas do pacote é ${novaLista.length}`)


    // Dia  17/06 



 // Metodo sort
    let frutas = [
        "banana","maça","laranja"
    ]
    // frutas.sort();
    // console.log(frutas);

// Eu adoro JavaScript e estudar com mueus colegas incriveis 




    //var
    
    let frase = " Eu adoro JavaScript e estudar com meus colegas incriveis ";
    frase.trim();// retirar espaços
    let fraseToLowerCase = frase.toLowerCase();// Tudo pra caixa baixa 



    // Em JavaScript, slice e splice são métodos de array com funcionalidades distintas. slice cria uma cópia de uma parte do array, sem modificar o array original, enquanto splice altera o array original removendo, substituindo ou adicionando elementos. 
    // slice():
    // Função: Extrai uma parte do array e retorna um novo array com essa parte.
    // Modifica o array original? Não.
    // Parâmetros:
    // start: Índice do início da extração (inclusivo).
    // end: Índice do fim da extração (exclusivo). Se omitido, extrai até o final do array.
    

    
    // console.log(`🗣️${fraseToLowerCase.replace("javascript","typescript")}`); // trocar java por TypeScript
    // console.log(` A frase Eu adoro JavaScript... contem a string JavaScript??? ${frase.includes("JavaScript")}`) // Essa frase inclue     



   const lista = [
    "maca","banana","laranja"
   ]
   lista.push("morango")
   lista.unshift("abacaxi")
   lista.shift()
   lista.pop()
   lista.splice(1,1,"manga")
   console.log(lista)


   
    // 3 principais formas de se trabalhar com prompt !!!




