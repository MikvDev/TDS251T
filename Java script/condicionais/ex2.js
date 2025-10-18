import Swal from 'sweetalert2'
function verificarChuva(tempo){
if(tempo === "chuvoso"){
    Swal.fire({
        title: 'Sucesso!',
        text: 'Seus dados foram enviados.',
        icon: 'success',
        confirmButtonText: 'Ok'
      });
}else{
   alert(`O tempo está bom, não se preocupe!`) 
}
}

let previsaoDoTempo = prompt("Digite como está o tempo!")

verificarChuva(previsaoDoTempo)
import Swal from 'sweetalert2'
