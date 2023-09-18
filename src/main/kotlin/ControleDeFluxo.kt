fun main() {

    maiorIdade(15)
    maiorIdade(29)
    maiorIdade(70)
}

fun maiorIdade(idade: Int) {
    if (idade in 18..59) {
        println("Maior de idade")
    } else if (idade > 60 ){
        println("Idoso")
    } else {
        println("Menor de idade")
    }
}