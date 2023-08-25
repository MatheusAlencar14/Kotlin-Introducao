fun main() {

    helloWord()

    println("A soma de 17 + 10 é: ${soma(17, 10)}")
    println("A divisão é: ${div1(15.5f, 3.3f)}")
    println("A divisão é: ${div2(9.9f, 3.0f)}")
}

fun soma(a: Int, b: Int) = a + b

fun helloWord() = println("Olá, Mundo!")

fun div1(c: Float, d: Float): Float {
    return c / d
}

fun div2(c: Float, d: Float) = c / d
