fun calculateAverage(number1: Double, number2: Double): Double {
    return (number1 + number2) / 2;
}

fun calculateDifference(number1: Double, number2: Double): Double {
    return if(number1 > number2) number1 - number2 else number2 - number1;
}

fun calculateProduct(number1: Double, number2: Double): Double {
    return number1 * number2;
}

fun calculateDivision(number1: Double, number2: Double): Double? {
    return if(number2 == 0.0) null else number1 / number2
}

fun main() {
    println("Média entre 10 e 20 = ${calculateAverage(10.0, 20.0)}")
    println("Diferença entre 20 e 10 = ${calculateDifference(20.0, 10.0)}")
    println("Diferença entra 10 e 20 = ${calculateDifference(10.0, 20.0)}")
    println("Produto de 5 e 4 = ${calculateProduct(5.0, 4.0)}")
    println("Divisão de 10 sobre 2 = ${calculateDivision(10.0, 2.0)}")
    println("Divisão de 10 sobre 0 = ${calculateDivision(10.0, 0.0)}")
}