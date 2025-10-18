// function ChapeuSeletor(Qualidade){
//     if(Qualidade === "coragem"){
//         alert("Você foi escolhido para a grifinória!")
//     }else if(Qualidade === "amizade"){
//         alert("Você foi escolhido para a lufa-lufa!")
//     }else if(Qualidade === "ambição"){
//         alert("Você foi escolhido para a sonserina!")
//     }else if(Qualidade === "sabedoria"){
//         alert("Você foi escolhido para a corvinal!")
//     }else if((Qualidade != "ambição")  && (Qualidade != "amizade") && (Qualidade != "coragem") &&(Qualidade != "sabedoria")){
//         alert(`Essa casa ainda não existe.. tente de novo, bruxo!🧙🏻🪄`)
//     }
// }
// let chapeu = prompt("Digite uma Qualidade:")
// ChapeuSeletor(chapeu)
function ChapeuSeletor(qualidade) {
    qualidade = qualidade.toLowerCase();

    if (qualidade === "coragem") {
        Swal.fire("Grifinória!", "Você foi escolhido para a Grifinória! 🦁", "success");
    } else if (qualidade === "amizade") {
        Swal.fire("Lufa-Lufa!", "Você foi escolhido para a Lufa-Lufa! 🦡", "success");
    } else if (qualidade === "ambição") {
        Swal.fire("Sonserina!", "Você foi escolhido para a Sonserina! 🐍", "success");
    } else if (qualidade === "sabedoria") {
        Swal.fire("Corvinal!", "Você foi escolhido para a Corvinal! 🦅", "success");
    } else {
        Swal.fire("Hmm...", "Essa casa ainda não existe... tente de novo, bruxo! 🧙🏻🪄", "warning");
    }
}

Swal.fire({
    title: 'Chapéu Seletor',
    input: 'text',
    inputLabel: 'Digite uma qualidade: coragem, amizade, ambição ou sabedoria',
    inputPlaceholder: 'Digite aqui...',
    confirmButtonText: 'Selecionar',
    showCancelButton: true,
    cancelButtonText: 'Cancelar',
    inputValidator: (value) => {
        if (!value) {
            return "Você precisa digitar uma qualidade!";
        }
    }
}).then((result) => {
    if (result.isConfirmed) {
        ChapeuSeletor(result.value);
    }
});