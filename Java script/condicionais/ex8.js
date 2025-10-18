function redeSocialFavorita(redeSocial){
     switch(redeSocial){
        case ("instagram"):
            alert(`Perfeito para fotos e stories!!`)
            break
        case ("TikTok"):
            alert(`Videos curtos e muita dança`)
            break
        case("Facebook"):
            alert(`Classico, mas anda forte para grupos`)
            break
        case("Linkedin"):
            alert(`Rede profissional e network`)
            break // lembre dos break
        default:
            alert(`Tente de novo!`)
     }
}
let escolha = prompt(`Digite uma rede social:`)
redeSocialFavorita(escolha)