package com.betrybe.playground

class OlympicDiscipline : Discipline(), Olympic {
    override fun extraClasses(): String {
        return "Aula extra"
    }

    override fun competition(): String {
        return ("Aula de competição")
    }
}