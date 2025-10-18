const { read } = require('fs')
const readline = require('readline')

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
})

rl.question("Qual é seu nome?", function(name){
    console.log(`Olá ${name}`)
    rl.close()
})