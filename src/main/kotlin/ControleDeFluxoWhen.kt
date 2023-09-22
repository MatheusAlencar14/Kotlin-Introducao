fun main() {
    println("O valor do bônus é: R$ ${bonus("Engenheiro de Software")}")
}

fun bonus3(cargo: String): Double {
    return when (cargo) {
        "Gerente" -> 2000.0
        "Coordenador" -> 1500.0
        "Engenheiro de Software" -> 1000.0
        "Estagiario" -> 500.0
        else -> 0.0
    }
}