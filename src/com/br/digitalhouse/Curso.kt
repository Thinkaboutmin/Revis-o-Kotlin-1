package com.br.digitalhouse
import com.br.digitalhouse.excecoes.NomeInvalido
import com.br.digitalhouse.excecoes.SemAlunos
import com.br.digitalhouse.excecoes.SemAulas

class Curso(val nome: String, val aulas: MutableList<Aula>, val alunos: MutableList<Aluno>, val professor: Doscente) {
    init {
        if (nome.isEmpty() || nome.isBlank()) {
            throw NomeInvalido()
        } else if (aulas.isEmpty()) {
            throw SemAulas()
        } else if(alunos.isEmpty()) {
            throw SemAlunos()
        }
    }
}