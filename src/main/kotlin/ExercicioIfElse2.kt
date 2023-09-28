fun main() {

    print("Digite o valor do lado a: ")
    var a = readln()
    print("Digite o valor do lado b: ")
    var b = readln()

    println(figura(a.toInt(), b.toInt()))

    print("Digite o valor do lado a: ")
    var a1 = readln()
    print("Digite o valor do lado b: ")
    var b1 = readln()
    print("Digite o valor do lado c: ")
    var c1 = readln()

    println(triangulo(a1.toInt(), b1.toInt(), c1.toInt()))
}

/*Escreva um programa capaz de ler dois números inteiros que representam os lados de uma figura
geométrica. Informar se formam um quadrado (lados iguais).*/

fun figura(a: Int, b: Int): String {
    if (a == b) {
        return "os lados formam um quadrado"
    }
    return "Os lados não formam um quadrado"
}

/*Escreva um programa capaz de ler três números inteiros que representam os lados de um triângulo. Informar
se é um triângulo equilátero (todos os lados iguais).*/

fun triangulo(a1: Int, b1: Int, c1: Int): String {
    if (a1 == b1 && a1 == c1) {
        return "É um triângulo equilátero!"
    }
    return "Este não é um triângulo equilátero"
}