fun main() {

    for (i in 1 .. 10) {
        print("$i ")
    }
    println()

    val str = "Kotlin é fera"
    for (char in str) {
        print("$char")
    }
    println()

    //Percorre a lista de 2 em 2
    for (i in 0 .. 20 step 2) {
        print("$i ")
    }
    println()

    //Pecorre decrescente de 5 em 5
    for (i in 50 downTo 0 step 5) {
        print("$i ")
    }
}