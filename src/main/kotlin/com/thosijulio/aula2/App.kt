package com.thosijulio.aula2

/* Exercícios
Exercício 1:
Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.

Exercício 2
Cada degrau de uma escada tem X de altura. Escreva um programa usando Kotlin que
receba essa altura e a altura que uma pessoa deseja alcançar usando a escada, calcule
e mostro quantos degraus ela deverá subir para atingir seu objetivo, sem se preocupar
com a altura da pessoa. Todas as medidas fornecidas devem estar em metros.

Exercício 3
Escrevas um programa em Kotlin que receba dois números e mostre o maior.

Exercício 4
Escrevas um programa em Kotlin que receba três notas de uma pessoa estudante e
mostre a média aritmética e a mensagem de acordo com as regras a seguir:
    . Média aritmética igual ou maior que 0.0 e menor do que 3.0, exibir a mensagem REPROVADO
    . Média aritmética igual ou maior que 3.0 e menor do que 7.0, exibir a mensagem EXAME
    . Média aritmética igual ou maior que 7.0 e menor do que 10.0, exibir a mensagem APROVADO
*/

fun exercicio1(salary: Float) {
    val INCREASE = 0.25f;
    println("Salário anterior: R$$salary. Novo Salário: R$${salary * INCREASE + salary}");
}

fun exercicio2(alturaDegrau: Float, alturaDesejada: Float) {
    val degraus = if (alturaDesejada % alturaDegrau != 0.0f)
        (alturaDesejada / alturaDegrau + 1).toInt()
    else
        (alturaDesejada / alturaDegrau).toInt()

    println("Você deverá subir $degraus degraus.")
}

fun exercicio3(num1: Float, num2: Float) {
    println("Maior número: ${if (num1 > num2) num1 else num2}")
}

fun exercicio4(nota1: Float, nota2: Float, nota3: Float) {
    val MEDIA = (nota1 + nota2 + nota3) / 3;

    when(true) {
        (MEDIA > 0 && MEDIA < 3) -> println("REPROVADO. Média: $MEDIA")
        (MEDIA < 7) -> println("EXAME. Média: $MEDIA")
        else -> println("APROVADO. Média: $MEDIA")
    }
}

fun main() {
    exercicio1(1500f);
    exercicio2(0.25f, 1.6f)
    exercicio3(3f, 2f)
    exercicio4(10f, 8f, 8f)
}