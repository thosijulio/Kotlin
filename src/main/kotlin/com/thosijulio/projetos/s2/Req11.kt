fun countNegativeNumbers(numbers: List<Double>): Int {
    return numbers.filter { number -> number < 0 }.size;
}

fun calculateSumOfPositiveNumbers(numbers: List<Double>): Double {
    return numbers.fold(0.0) { acc, number -> if (number >= 0) (acc + number) else acc}
}

fun main() {
    val numbers = listOf(-1.0, 2.0, -3.0, 4.0, -5.0);

    println("Quantidade de números negativos na lista: ${countNegativeNumbers(numbers)}");
    println("Soma dos números positivos na lista: ${calculateSumOfPositiveNumbers(numbers)}");
}