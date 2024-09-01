package tictactoe

fun main() {

    var i = 0
    print("> ")
    val input = readln()
    println("---------")
    print("| ")
    while (i < 9) {
        print("${input[i]} ")
        if (i == 2 || i == 5 || i == 8) {
            println("|")
            if (i == 2 || i == 5) print("| ")

        }
        i++

    }
    println("---------")
}




