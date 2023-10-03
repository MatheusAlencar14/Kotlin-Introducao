fun main() {
    numCrescente()
    println()
    println()

    numDecrescente()
    println()
    println()

    menos5()
    println()
    println()

    print(somaTotal())
    println()
    println()

    print("Digite um número: ")
    var n = readln()
    escrever(n.toInt())
}

/*Imprima os números de 1 a 50 na mesma linha em ordem crescente. Saída esperada:
“1 2 3 4 5 6 7 8 9 10 .. .. .. 49 50”*/

fun numCrescente() {
    for (i in 1 .. 50) {
        print("$i ")
    }
}

/*Imprima os números de 1 a 50 na mesma linha em ordem decrescente. Saída esperada:
“50 49 48 47 .. .. .. 2 1”*/

fun numDecrescente() {
    for (i in 50 downTo  1) {
        print("$i ")
    }
}

/*Usando a resolução do exercício 1, não imprima os números múltiplos de 5.*/

fun menos5() {
    for (i in 1 ..  50) {
        if (i % 5 == 0) {
            continue
        } else {
            print("$i ")
        }
    }
}

/*Faça a soma de todos os números no intervalo de 1 a 500.*/

fun somaTotal(): Int {
    var soma = 0
    for (i in 1..500) {
        soma += i;
    }
    return soma;
}

/*Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando
o caracter #.*/

fun escrever(n: Int) {
    for (i in 1 .. n) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}