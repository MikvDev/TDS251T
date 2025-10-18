function podeEntrar(IdadeDaPessoa){
 if(IdadeDaPessoa >= 16) {
    
    alert(`Pode entrar no cinema!`)
 }else{
    alert("Infelizmente você não pode entrar no cinema...")
 }
  
}

let idade = parseFloat(prompt("Digite sua idade!"))
podeEntrar(idade)