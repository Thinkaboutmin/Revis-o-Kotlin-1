package com.br.digitalhouse

/*
 * Aluno
 *
 * Desenvolvedor: Jomar
 */


class Aluno(val ra: Int, val nome: String, val sobrenome: String) {
    init {
        if (nome.isEmpty()) {
            println("Nome está vazio.")
        }
        if (sobrenome.isEmpty()) {
            println("Sobrenome está vazio.")
        }
    }

    fun assistirAula(aula: Aula) {
        println("O aluno $nome $sobrenome está assistindo a aula")
        // TODO: Sem materia ainda...
    }

    fun fazerLicao(aula: Aula) {
        // TODO: Classe para lição
        println("O aluno $nome $sobrenome está realizando a a lição de casa.")
    }
}