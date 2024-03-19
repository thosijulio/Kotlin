fun calculateCommission(salesAmount: Double): Double {
    val commissionPercentage = 0.04;
    return salesAmount * commissionPercentage;
}

fun calculateFinalSalary(baseSalary: Double, commission: Double): Double {
    return baseSalary + commission;
}

fun main() {
    print("Digite o salário: R$");
    val baseSalary = readln().toDoubleOrNull();
    print("Digite o total de vendas: R$")
    val salesAmount = readln().toDoubleOrNull();

    if (baseSalary is Double && salesAmount is Double) {
        calculateFinalSalary(baseSalary, calculateCommission(salesAmount));
    }
}