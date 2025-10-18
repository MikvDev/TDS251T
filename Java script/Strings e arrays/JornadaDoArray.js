// =================================================================================== // Dia 12.06



// Jornada do heroi do reino dos talentos
//=====================================================================================


/* EM um reino distante, um jovem e talentoso desenvolvedor descobre uma espada magica que revela seu destino como heroi. 
Com coragem e poucos recursos, ele parte em uma jornada desafiadora 
* o cenario:
* O jogador é um heroi que embarca em uma jornada epica. Ao longo do caminho, ele encontra inimigos, coletara itens e enfrentará desfios.



*/

// espada do gigante 4 
//2. Criando o inventario do heroi:
// O heroi começa sua avenrtura com alguns itens basicos. Vamos armazenar esses itensem um array.



let inventario = 
[
    "Espada do destino: 3", 
    "Escudo da coragem: 3 ",
    "Amuleto do guardião: 15",
    "Botas de agilidade: 3",
    "Shuriken: 6"
 ]


 // exibindo o inventario inicial do heroi
console.log(`O seu inventario é.:${inventario}`)
 console.log(' 🎒 -> o seu inventario é.: ');
 console.log('                                       ');
 console.log("🎒 -> ",inventario);
 console.log("                                       ");
console.log('=========================================');
console.log("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
console.log('=========================================');


 // 4. Encontrando um tesouro 
 // O heroi encontra um bau de tesouro e ganha um novo item!!!


console.log("✨O heroi encontrou um novo item!✨")
inventario.push("Espada do gigante")
console.log('------------------------------------');
console.log(`*** Você encontrou a espada do gigante ***`);

console.log('------------------------------------');
console.log("                                      ")
console.log(`Você possui ${inventario.length} no inventario -> 🎒 -`);
console.log('=========================================');
console.log("°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°°");
console.log('=========================================');
// 5. Enfrentando um inimigo
// O heroi enfrenta um globim chamado de goblindoTigrinho 🐯. Qual arma Você vai usar?? 
console.log('                                      ');
console.log();
console.log('                                     ');
console.log("Um goblim apareceu!!! Preparece para a batalha!!! Dano 13: ")
console.log('------------------------------------');
console.log('------------------------------------');
let itemUsado1 = inventario[0] // indice do item
console.log(`Você ataca o goblin com sua ${itemUsado1}`) 
console.log( "                                           " )

//6.O goblin sentiu o golpe..... agora ele tenta deu ultimo ataque cim um dano de 3! Como você finaliza esse adversario? 
let itemUsado2 = inventario[5]

console.log('------------------------------------');
console.log(`Você finaliza o goblin com ${itemUsado2} ✨🗡️`);
console.log('------------------------------------');
// 7. Um  golem aproveita sua distração e o ataca violentamente com um soco cosmico! Dano: 9.. Como você revida?

let itemUsado3 = inventario[4]

console.log(`Você revida com ${itemUsado3}`
)
// calcule seus recursos

recursosResistencia =  [inventario[1, 2]]
console.log(`Meus recursos de resistencia: ${recursosResistencia}`


)
//8. finalizando a aventura... por enquanto Nosso adeus não é para sempre 
//Como você finalario o golpe 

let itemUsado4 = inventario[1]

console.log(`Você finalizou com o com golem com ${itemUsado4}`)