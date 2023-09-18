fun main() {

    transforma(2)

    println(quantString("Eu serei um Desenvolvedor de sucesso!"))

    println(cubo(3))

    println(milhas(2.5f ))

    println(troca("Como eu gostaria de estar na minha casa"))
}
//Escreva uma função que receba uma quantidade de anos e transforme em meses, dias,
//minutos e segundos
fun transforma(anos: Int) {
    println("${anos} anos equivalem a:")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}

//Escreva uma função que recebe uma String e retorna a quantidade de caracteres
fun quantString(frase: String) :Int = frase.length

//Escreva uma função que calcule o cubo de um número inteiro
fun cubo(num: Int) = num * num * num

//Escreva uma função que converta milhas para km
fun milhas(num: Float) = num * 1.6

//Escreva um programa que troque as letras "a" e "A" de uma String por "x"
fun troca(frase: String) = frase.replace("a", "x", true).lowercase()