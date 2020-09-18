package com.br.digitalhouse

import com.br.digitalhouse.excecoes.NomeInvalido

class Materia(val nome: String, val id: Int) {
    init {
        if (nome.isEmpty()) {
            throw NomeInvalido()
        }
    }
}