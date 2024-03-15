package com.thosijulio.aula2

/* Exercício 1:
Escreva um programa usando Kotlin que receba o salário de uma pessoa colaboradora,
calcule e mostre o novo salário, sabendo-se que este sofreu um aumento de 25%.
*/

fun exercicio1(salary: Float) {
    val INCREASE = 0.25f;
    print("Salário anterior: R$$salary. Novo Salário: R$${salary * INCREASE + salary}");
}

fun main() {
    exercicio1(1500f);
}