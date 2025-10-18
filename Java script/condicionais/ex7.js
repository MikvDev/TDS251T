// function ffk(opcao){
//     switch(opcao)
// }

let dia = parseFloat(prompt("Digite um numero de 1 a 5 para o dia da semana: "))
switch (dia){
    case 1:
        alert(`Segunda-feira: Segunda de novo! calma que tem mais 4 dia pro fim de semana. `)
        break
    case 2:
        alert(`Terça-feira: É quase quarta! `)
        break
    case 3:
        alert(`Quarta-feira: Tá quase acabando, aguenta as pontas!`)
        break
    case 4:
        alert(`Quinta-feira: Falta só um dia`)
        break
    case 5: 
        alert(`Finalmente`)
        break
    default:
        alert(`Digite um numero de 1 a 5 (dias da semana) - Isso não ficou obvio?`)
}
// 