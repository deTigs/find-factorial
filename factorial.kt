
fun main() {
    println("Enter a number to find its factorial:")
    val number = readlnOrNull()?.toIntOrNull()

    if (number != null) {
        var factorial = 1
        for (i in 1..number) {
            factorial *= i
        }
        println("$number factorial is $factorial")
    }
    else {
        println("Please enter a valid integer.")
    }
}