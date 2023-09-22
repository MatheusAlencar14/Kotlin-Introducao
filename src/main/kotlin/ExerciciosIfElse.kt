fun main() {
    println("O valor do bônus é: R$ ${bonus("Engenheiro de Software")}")

    println("O valor do bônus é: R$ ${bonus2("Coordenador", 5)}")
}

/*
Escreva um programa para uma empresa calcular o bônus que os funcionários receberão no fim
do ano. Os bônus são classificados por cargo:
1. Gerentes: 2000,00; 2.Coordenadores: 1500,00;
3. Eng. Software: 1000,00; 4. Estagiários: 500,00.
*/

fun bonus(cargo: String): Double {
    var valor = 0.0
    if (cargo == "Gerente") {
        valor = 2000.0
    } else if (cargo == "Coordenador") {
        valor = 1500.0
    } else if (cargo == "Engenheiro de Software") {
        valor = 1000.0
    } else if (cargo == "Estagiario") {
        valor = 500.0
    }
    return valor
}

/*
Modifique o primeiro exercício para considerar o tempo de experiência no cálculo de bônus
*/

fun bonus2(cargo: String, tempo: Int): Double {
    var valor = 0.0
    if (cargo == "Gerente" && tempo >= 2) {
        valor = 3000.0
    } else if (cargo == "Gerente" && tempo < 2) {
        valor = 2000.0
    } else if (cargo == "Coordenador" && tempo < 1) {
        valor = 1500.0
    } else if (cargo == "Coordenador" && tempo >= 1) {
        valor = 1800.0
    } else if (cargo == "Engenheiro de Software") {
        valor = 1000.0
    } else if (cargo == "Estagiario") {
        valor = 500.0
    }
    return valor
}