fun main() {
    val original = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6)
    )
    val transposta = Array(3) { IntArray(2) }
    for (i in original.indices) {
        for (j in original[i].indices) {
            transposta[j][i] = original[i][j]
        }
    }
    println("Matriz original:")
    for (linha in original) {
        println(linha.contentToString())
    }
    println("Matriz transposta:")
    for (linha in transposta) {
        println(linha.contentToString())
    }
}