package com.br.digitalhouse
import com.br.digitalhouse.excecoes.NomeInvalido
import com.br.digitalhouse.excecoes.SemAlunos
import com.br.digitalhouse.excecoes.SemAulas

class Curso(val nome: String, aulas: MutableList<Aula>, val alunos: MutableList<Aluno>, val professor: Doscente) {
    init {
        if (nome.isEmpty()) {
            throw NomeInvalido()
        } else if (aulas.isEmpty()) {
            throw SemAulas()
        } else if(alunos.isEmpty()) {
            throw SemAlunos()
        }
    }
}