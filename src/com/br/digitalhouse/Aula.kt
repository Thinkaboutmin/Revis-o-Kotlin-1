package com.br.digitalhouse
import com.br.digitalhouse.excecoes.IntervaloInvalido
import java.time.LocalTime

class Aula(val materia : Materia, val inicio : LocalTime, val fim : LocalTime) {
    init{
        if (inicio >= fim) {
            throw IntervaloInvalido()
        }
    }
}
