const arrayDeNum = [
    19.9, 35.5, 12.0, 8.4
]
var total = 0

for(const numero of arrayDeNum){
    total += numero // total += => total 
    console.log(`A soma é ${total.toFixed(2)}`) // aredonda para duas casas decimais 
}