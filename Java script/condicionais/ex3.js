function escolherRoupa(temperatura){
    if(temperatura < 10){
    alert(`Vista um casaco bem quente! está muito frio❄️☃️`)
    }
    if((temperatura > 10 ) && (temperatura < 19)){
        alert(`Coloque um casaco. Está fresquinho!`)
    }
    if((temperatura > 20) && (temperatura < 30)){ // else if 
    alert(`Use algo confortavel, como camisa e calça..`)
    }
    if(temperatura > 30){ // else if 
    alert(`Vista roupas leves. Está muito quente!`)
    }
    if( temperatura != Number ){ // else if 
        alert("Tente novamente, temperatura não entendida!")
    }
}

let temperaturaDoAmbiente = parseFloat(prompt("Digite a temperatura do dia: "))
escolherRoupa(temperaturaDoAmbiente)