fun calculateNewSalary(currentSalary: Double): Double {
    when {
        currentSalary <= 300.0 -> {
            return currentSalary + (currentSalary * 0.5);
        }
        currentSalary <= 500.0 -> {
            return currentSalary + (currentSalary * 0.4);
        }
        currentSalary <= 700.0 -> {
            return currentSalary + (currentSalary * 0.3);
        }
        currentSalary <= 800.0 -> {
            return currentSalary + (currentSalary * 0.2);
        }
        currentSalary <= 1000.0 -> {
            return  currentSalary + (currentSalary * 0.1);
        }
        else -> {
            return currentSalary + (currentSalary * 0.05);
        }
    }
}

fun main() {
    println("Salário anterior: R$200,00. Novo Salário: R$${calculateNewSalary(200.0)}")
    println("Salário anterior: R$400,00. Novo Salário: R$${calculateNewSalary(400.0)}")
    println("Salário anterior: R$600,00. Novo Salário: R$${calculateNewSalary(600.0)}")
    println("Salário anterior: R$750,00. Novo Salário: R$${calculateNewSalary(750.0)}")
    println("Salário anterior: R$900,00. Novo Salário: R$${calculateNewSalary(900.0)}")
    println("Salário anterior: R$1200,00. Novo Salário: R$${calculateNewSalary(1200.0)}")
}