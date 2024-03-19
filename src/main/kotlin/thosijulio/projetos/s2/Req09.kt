fun calculateFinalPrice(carValue: Double, installment: Int, surcharges: Array<Double>): Double {
    if (installment == 1) return carValue - (carValue * 0.2);

    when (installment) {
        12 -> {
            return carValue + (carValue * surcharges[0])
        }
        24 -> {
            return carValue + (carValue * surcharges[1])
        }
        36 -> {
            return carValue + (carValue * surcharges[2])
        }
        48 -> {
            return carValue + (carValue * surcharges[3])
        }
        else -> {
            return carValue + (carValue * surcharges[4])
        }
    }
}

fun main() {
    println(calculateFinalPrice(25000.0, 1, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 12, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 24, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 36, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 48, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
    println(calculateFinalPrice(25000.0, 60, arrayOf(0.06, 0.12, 0.18, 0.24, 0.30)))
}