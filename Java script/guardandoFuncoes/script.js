

function dancar(){
    swal("Dança dança gatinho 🐈🐈🐈🐈")
}

function chamarHeroi(nomeDoHeroi){
    swal(nomeDoHeroi.toUpperCase() + "!!!")
}
function criarApelido(nome,animal){
    Swal.fire({
        title: 'bdhabfhsb',
        input:'digite aqui!!'
    })
}
function moedasTotais(p, g){
return parseFloat(p) +parseFloat(g)*5
}

function mostrarMoedas(){
    let p = prompt("Quantas moedas pequenas você tem, meu camarada??")
    let g = prompt("Quantas moedas grandes você tem, meu compadre??")
    let moedaTotal = moedasTotais(p,g)
    swal("Você fez"+ moedaTotal +"pontos em moedas !"  )
}
function mostrarCodinome(){
    let objeto = prompt("Digite um objeto ai")
    let numero = prompt("Digite um numero ai")
    swal(`Seu codinome é ${objeto}${numero}`)
}
function mostrarChocolate(){
    let grana  = parseFloat(prompt("Quantos reais você tem?"))
    let calcularChocolate = grana / 2.50
        swal(`Você pode comprar ${calcularChocolate} com ${grana} reais `)
}