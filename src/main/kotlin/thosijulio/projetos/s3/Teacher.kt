package com.betrybe.playground

class Teacher : Collaborator() {
    var subjects: List<Discipline> = ArrayList();
    var period: PeriodEnum = PeriodEnum.NIGHT;
}