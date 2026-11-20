fun main() {
    val notas = arrayOf(
        doubleArrayOf(8.0, 7.5),
        doubleArrayOf(5.0, 6.0),
        doubleArrayOf(9.0, 8.5)
    )
    var somaGeral = 0.0
    var totalNotas = 0
    for (i in notas.indices) {
        var somaAluno = 0.0
        for (j in notas[i].indices) {
            somaAluno += notas[i][j]
            somaGeral += notas[i][j]
            totalNotas++
        }
        val mediaAluno = somaAluno / notas[i].size
        val status = if (mediaAluno >= 7.0) "Aprovado" else "Reprovado"
        println("Aluno ${i + 1}: Média = $mediaAluno ($status)")
    }
    val mediaGeralTurma = somaGeral / totalNotas
    println("Média geral da turma: $mediaGeralTurma")
}