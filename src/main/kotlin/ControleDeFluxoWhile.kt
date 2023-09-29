fun main() {

    var str = "Kotlin"
    var i = 0
    while (i < str.length) {
        print("${str[i]} ")
        i++
    }
    println()

    i = 0
    while (i <= str.length) {
        print("$i ")
        i++
    }
    println()

    i = 20
    while (i > 0) {
        print("$i ")
        i--
    }

    do {
        print("$i ")
        i++
    } while (i < 30)

}