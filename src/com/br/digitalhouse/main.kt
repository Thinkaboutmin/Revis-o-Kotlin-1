package com.br.digitalhouse

import com.br.digitalhouse.excecoes.IntervaloInvalido
import com.br.digitalhouse.excecoes.NomeInvalido
import com.br.digitalhouse.excecoes.SemAlunos
import com.br.digitalhouse.excecoes.SemAulas
import java.time.LocalTime

fun MutableList<Aula>.preencherAulas(materias: List<Materia>, inicio: LocalTime, fim: LocalTime) {
    for (materia in materias) {
        this.add(Aula(materia, inicio, fim))
    }
}

fun MutableList<Aluno>.gerarEstudantes(nomes: Array<String>, sobrenomes: Array<String>) {
    var idRa = 0
    for (nome in nomes) {
        for (sobrenome in sobrenomes) {
            this.add(Aluno(idRa, nome, sobrenome))
            ++idRa
        }
    }
}

/*
 * Gera uma turma de matemática com valores pré definidos.
 */
fun gerarTurmaDeMatematica(): Turma {
    val materiasMatematica = mutableListOf(
            Materia("Aritmética I", 0),
            Materia("Aritmética II", 1),
            Materia("Aritmética III", 2),
            Materia("Lógica I", 3),
            Materia("Lógica II", 4),
            Materia("Aritmética Avançada I", 5),
            Materia("Aritmética Avançada II", 6)
    )

    val aulasMatematica = mutableListOf<Aula>()
    aulasMatematica.preencherAulas(materiasMatematica, LocalTime.parse("08:00"), LocalTime.parse("11:50"))


    // Criação em massa de uma briga para saber quem responder na chamada
    val nomes = arrayOf(
            "João", "Maria", "Milena", "Pedro", "Jomar", "Fulano", "Rodrigo", "Barbara", "Jamelão"
    )
    val sobrenomes = arrayOf(
            "Júnior", "Lemos", "Silva", "Peixoto", "Golçanves", "Vargas"
    )

    val alunosMatematica = mutableListOf<Aluno>()
    alunosMatematica.gerarEstudantes(nomes, sobrenomes)

    val professorDeMatematica = Professor("Chavier", 0)

    val cursoMatematica = Curso(
            "Matematica Básica",
            aulasMatematica,
            alunosMatematica,
            professorDeMatematica
    )


    return Turma("Matematica Top", cursoMatematica)
}

fun main() {
    try {
        val turmaMatematica = gerarTurmaDeMatematica()

        println("Iniciando aula")

        println("Alunos que vão assistir as aula de ${turmaMatematica.curso.aulas[0].materia.nome}")
        // Sim, todos vão estar assistindo a aula.
        for (aluno in turmaMatematica.curso.alunos) {
            aluno.assistirAula(turmaMatematica.curso.aulas[0])
        }
        println("\n")


        println("Professor vai realizar a chamada".padEnd(25, '-').padStart(25, '-'))
        println("\n")
        val professorDeMatematica = turmaMatematica.curso.professor
        professorDeMatematica.fazerChamada(turmaMatematica, turmaMatematica.curso.alunos)

        println("\n")
        professorDeMatematica.darAula(turmaMatematica.curso.aulas[0])

        println("Fim da aula. Lição de casa passada aos alunos".padEnd(25, '-').padStart(25, '-'))
        println("\n")
        for (aluno in turmaMatematica.curso.alunos) {
            aluno.fazerLicao()
        }

    } catch(erro: NomeInvalido) {
        println(erro.message)
    } catch(erro: IntervaloInvalido) {
        println(erro.message)
    } catch(erro: SemAlunos) {
        println(erro.message)
    } catch(erro: SemAulas) {
        println(erro.message)
    }
}
