# Kotlin Playground 1

## 1 - Criar uma Enum Class chamada PeriodEnum
 * O enum deve contér as entradas:
    - MORNING
    - AFTERNOON
    - NIGHT

## 2 - Criar uma interface chamada Olympic
 * A interface deve possuir dois métodos chamados extraClasses e competition, ambos retornando string.

## 3 - Criar uma classe chamada Discipline
 * A classe deve ter os seguintes atributos:
    - name, do tipo String
    - code, do tipo Int

## 4 - Criar uma classe chamada Person
 * A classe deve ter os seguintes atributos:
    - name, do tipo String
    - age, do tipo Int
    - email, do tipo String

## 5 - Criar uma classe chamada Collaborator, que realize a herança da classe Person
 * A classe deve ter os seguintes atributos:
    - Todos os atributos da classe herdada
    - functionId, do tipo String

## 6 - Criar uma classe chamada Teacher, que realize a herança da classe Collaborator
 * A classe deve ter os seguintes atributos:
    - Todos os atributos da classe herdada
    - subjects, do tipo List<Discipline>
    - academicPeriod, do tipo PeriodEnum

## 7 - Criar uma classe chamada Directior, que realize a herança da classe Collaborator
 * A classe deve ter os seguintes atributos:
    - Todos os atributos da classe herdada
    - startTime, do tipo String
    - endTime, do tipo String

## 8 - Criar uma classe chamada Student, que realize a herança da classe Person
 * A classe deve ter os seguintes atributos:
    - Todos os atributos da classe herdada
    - enrollmentNumber, do tipo Int
    - subjects, do tipo String
    - period, do tipo PeriodEnum

## 9 - Criar uma classe chamada OlympicDiscipline, que realize a herança da classe Discipline, e implementa a interface Olympic
 * A classe deve ter os seguintes atributos:
    - Todos os atributos da classe herdada
    - Todas as funções da interface implementada
