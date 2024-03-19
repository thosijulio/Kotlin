fun calculateDiscount(originalPrice: Double): Double {
    val discount = originalPrice * 0.1;
    return originalPrice - discount
}

fun main() {
    val originalPrice: Double? = readlnOrNull()?.toDouble()

    if (originalPrice is Double) {
        calculateDiscount(originalPrice);
    }

}
