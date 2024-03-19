fun calculateYears(birthYear: Int, currentYear: Int): Int {
    return currentYear - birthYear;
}

fun calculateMonths(birthYear: Int, currentYear: Int): Int {
    return (currentYear - birthYear) * 12;
}

fun calculateDays(birthYear: Int, currentYear: Int): Long {
    return ((currentYear - birthYear) * 365.25).toLong();
}

fun calculateWeeks(birthYear: Int, currentYear: Int): Long {
    return ((currentYear - birthYear) * 52.1786).toLong();
}

fun main() {
    print("Digite o ano de nascimento: ");
    val birthYear = readln().toIntOrNull();
    print("Digite o ano atual: R$")
    val currentYear = readln().toIntOrNull();

    if (birthYear is Int && currentYear is Int) {
        calculateYears(birthYear, currentYear);
        calculateMonths(birthYear, currentYear);
        calculateDays(birthYear, currentYear);
        calculateWeeks(birthYear, currentYear);
    }
}