//portas logicas 06.06

//

//aristoteles e boole

//  1 vdd
// 0 false
// and 
// or 
// and or not 




// Operadores Logicos Rpzd

// valores de exemplo 

let a = true
let b = false
 
console.log("Operadores lôgicos em Javascpript")

// AND (&&) - retorna true se ambos forem true


console .log(" True && true =>", true && true) // true 
console.log("true && false =>", true && false ) // false 
console.log("a && b =>", a && b) // false 


// or (||) - Retorna true se pelo menos um for true 

console.log("true || false =>",  true || false) // true 
console.log(" false || false =>", false || false)  // false 
console.log("a || b =>" , a || b) //true 



// NOT (!) - Inverte o valor booleano 

console.log(" !true => ", !true) // false 
console.log(" !false =>" ,!false ) // true 
console.log(" !a =>", !a) // false 
console.log("!b =>", !b) // true - inverteu o valor da var boolean false para true 


// combinações mais complexas :()

console.log("!(a && b) =>", !(a && b)) //true
console.log(" (a || b) !b => ", (a || b) && !b) // true