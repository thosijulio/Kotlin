fun calculateSumEven(numbers: List<Int>): Int {
    return numbers.fold(0) { acc, number -> if (number % 2 == 0) acc + number else acc }
}

fun calculateSumOdd(numbers: List<Int>): Int {
    return numbers.fold(0) { acc, number -> if (number % 2 != 0) acc + number else acc }
}

fun main() {
    println("Soma dos números pares: ${calculateSumEven(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))}")
    println("Soma dos números ímpares: ${calculateSumOdd(listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))}")
}