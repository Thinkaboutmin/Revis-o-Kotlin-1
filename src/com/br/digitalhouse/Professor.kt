package com.br.digitalhouse

class Professor(val nome: String, val rd: Int) : Doscente {
    override fun darAula(aula: Aula) {
        println("O professor está dando aula de ${aula.materia}")
    }

    override fun fazerChamada(turma: Turma, alunosPresentes: MutableList<Aluno>) {
        for (aluno in turma.curso.alunos) {
            var presente = false
            for (alunoPresente in alunosPresentes) {
                if (aluno == alunoPresente) {
                    presente = true
                    break
                }
            }
            if (presente) {
                println("${aluno.nome} ${aluno.sobrenome} está presente")
            } else {
                println("${aluno.nome} ${aluno.sobrenome} não está presente")
            }
        }
    }
}