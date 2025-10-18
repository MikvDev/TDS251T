let numeros = [
    10, 90, 1000, 78
]
//criar uma array chamada "numeros" com quatro valores!
let maior = [0]
// criar uma variavel "maior" e atribui a ela o primero numero do array, no caso armazenando o 10 no indice 0
//Neste momento, estamos assumindo que 10 é o maior numero (mas pode mudar ..)
for(let i = 1; i < numeros.length; i++){
    // inicia o laço for que começa com indice 1 (ou seja, o segundo numero do array)
    // a condiçâo i < numeros.length garante que o laço percorra os elementos restantes da array 
    // a variavel "i" vai de 1 até 3 (indice dos elementos)
    if(numeros[i] > maior)
    {
     maior = numeros[i]
     
    }
}

console.log(`${maior}`)