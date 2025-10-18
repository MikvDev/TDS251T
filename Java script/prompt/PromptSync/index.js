const prompt = require('prompt-sync')(); // primeiro é preciso importar 

// const nome = prompt("Qual é seu nome? ")
// const idade = prompt('Quantos anos você tem? ')

// console.log('------------------------------------');
// console.log(`Ola!! ${nome}, Você tem ${idade} anos`);
// console.log('------------------------------------');


//var 


// let num1 = parseFloat(prompt('Digite um numero:')) // parseFloat importante para definir numeros para soma, ou number
// let num2 = parseFloat(prompt('Digite outro numero:'))
// let soma = num1 + num2


// console.log(`Esse numero ${num1} mais esse numero ${num2} é: ${soma}`)

//var
var senhaAreaRestrita = "124"
var senha = prompt("Qual a senha! ")
var idade = prompt("Qual sua idade?? ")

var verificão = (senha === "124") && (idade >= 18)

console.log(`Você pode entrar? ${verificão}`)






