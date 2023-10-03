fun main() {
    val str: String? = null

    // Verificação padrão
    if (str == null) {
        println("NULO")
    } else {
        println(str)
    }

    println(str ?: "NULO")


    // TODO Não existe operador ternário em Kotlin

    //Não há operador ternário no Kotlin pois o If Else cumpre esse papel. Exemplo:
    var idade = 20
    var str2 = if (idade > 18) print("Maior de idade") else print("Menor de idade")

}