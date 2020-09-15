package com.br.digitalhouse

import com.br.digitalhouse.excecoes.NomeInvalido

/*
 * Aluno
 *
 * Desenvolvedor: Jomar
 */


class Aluno(val ra: Int, val nome: String, val sobrenome: String) {
    init {
        if (nome.isEmpty()) {
            throw NomeInvalido()
        }
        if (sobrenome.isEmpty()) {
            throw NomeInvalido()
        }
    }


    fun assistirAula(aula: Aula) {
        println("O aluno $nome $sobrenome está assistindo a aula de ${aula.materia}")
    }

    fun fazerLicao() {
        // TODO: Classe para lição
        println("O aluno $nome $sobrenome está realizando a a lição de casa.")
    }
}