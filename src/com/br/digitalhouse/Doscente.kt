package com.br.digitalhouse

interface Doscente {
    fun darAula (aula : Aula)

    fun fazerChamada(turma: Turma, alunosPresentes: MutableList<Aluno>)
}