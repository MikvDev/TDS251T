function compararNumeros(num1,num2){


if( num1 === num2){ // se forem iguais exibe uma mensagem 
alert(`Os numeros são iguas!!`)   
}else{
    alert(`Os numeros não são iguais!!`)
}
}
let numeroRequerido1 = parseFloat(prompt("Gigite um numero"))
let numeroRequerido2 = parseFloat(prompt("Digite um numero"))
compararNumeros(numeroRequerido1, numeroRequerido2)
// Função que compara dois numeros
// verificar se condicional é igual(num1 === num2)