fun calculateConsumerPrice(factoryCost: Double): Double {
    when {
        (factoryCost <= 12000.0) -> {
            return factoryCost + (factoryCost * 0.05);
        }

        (factoryCost <= 25000.0) -> {
            return factoryCost + ((factoryCost * 0.1) + (factoryCost * 0.15));
        }

        else -> {
            return factoryCost + ((factoryCost * 0.15) + (factoryCost * 0.2));
        }
    }
}

fun main() {
    println("Preço de Fábrica: R$10.000. Preço final: R$${calculateConsumerPrice(10000.0)}")
    println("Preço de Fábrica: R$15.000. Preço final: R$${calculateConsumerPrice(15000.0)}")
    println("Preço de Fábrica: R$30.000. Preço final: R$${calculateConsumerPrice(30000.0)}")
}