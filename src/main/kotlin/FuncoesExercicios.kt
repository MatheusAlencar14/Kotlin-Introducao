fun main() {

    var anos = 2
    println(transforma(anos))

    var frase = "Eu serei um Desenvolvedor de sucesso!"
    println(quantString(frase))

    var num = 3
    println(cubo(num))

    println(milhas(num))
}
//Escreva uma função que receba uma quantidade de anos e transforme em meses, dias,
//minutos e segundos
fun transforma(anos: Int) {
    var meses = anos * 12
    var dias = anos * 365
    var horas = dias * 24
    var minutos = horas * 60
    var segundos = minutos * 60
   return println("${anos} anos equivalem a:" +
           "\n${meses} meses" +
           "\n${dias} dias" +
           "\n${horas} horas" +
           "\n${minutos} minutos" +
           "\n${segundos} segundos")
}

//Escreva uma função que recebe uma String e retorna a quantidade de caracteres
fun quantString(frase: String) = frase.length

//Escreva uma função que calcule o cubo de um número inteiro
fun cubo(num: Int) = num * num * num

//Escreva uma função que converta milhas para km
fun milhas(num: Int) = num * 1.6