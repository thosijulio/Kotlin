fun calculateAverage(ages: List<Int>): Double {
    return (ages.reduce { acc, age -> acc + age } / ages.size).toDouble();
}

fun countPeopleWeightHeight(weights: List<Double>, heights: List<Double>): Int {
    var peoples = 0;

    for (index in weights.indices) {
        if (weights[index] > 90 && heights[index] < 1.5)
            peoples += 1;
    }

    return peoples;
}

fun calculatePercentageAgeHeight(ages: List<Int>, heights: List<Double>): Int {
    var percentage = 0;

    for (index in ages.indices) {
        if (ages[index] in 10..30 && heights[index] >= 1.9) {
            percentage += 100 / ages.size;
        }
    }

    return percentage;
}

fun main() {
    println("Média entre as idades 25, 30, 35, 40, 45: ${calculateAverage(listOf(25, 30, 35, 40, 45))}");
    println("Quantidade de pessoas com peso superior a 90Kg e altura inferior a 1.5m: ${countPeopleWeightHeight(listOf(80.0, 95.0, 70.0, 100.0, 98.0), listOf(1.95, 1.96, 1.60, 1.96, 1.45))}");
    println("Porcentagem de pessoas com idade entre 10 e 30 anos que medem mais de 1.9m: ${calculatePercentageAgeHeight(listOf(25, 30, 35, 40, 45), listOf(1.95, 1.96, 1.60, 1.96, 1.45))}%");
}