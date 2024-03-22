package com.betrybe.playground

class Student : Person() {
    val enrollmentNumber: Int = 0;
    val subjects: List<Discipline> = ArrayList()
    val academicPeriod: PeriodEnum = PeriodEnum.NIGHT
}