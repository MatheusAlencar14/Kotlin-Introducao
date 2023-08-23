fun main() {

    var nomeCompleto = "Matheus Alencar";
    var txt: String
    val menor: Byte = 43
    val pibBrasil: Long = 1869000000000
    val populacao: Int = 211000000
    var pibPerCapta = pibBrasil / populacao

    println("Pib per capta: $pibPerCapta") //ou
    println("Pib per capta: ${pibBrasil/populacao}")
}