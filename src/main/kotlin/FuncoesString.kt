fun main() {
    val str = "Programação Kotlin."

    println("Tamanho da String: ${str.length}")
    println("Posição (index) 0 da String: ${str[0]}")
    //Verificar inicio da String (true)
    println(str.startsWith("Pro"))
    //Verificar final da String (false)
    println(str.endsWith("abc"))
    //Solicitar uma parte da string
    println(str.substring(2, 7))
    //Trocar uma parte da String
    println(str.replace("Kotlin.", "Kotlin é fera!"))
    //Trocar toda a String para minúsculo
    println(str.lowercase())
    //Trocar toda a String para MAIÚSCULO
    println(str.uppercase())
    //Retirar espaços em branco no início e fim da String
    println("     meu nome é        ".trim())
}