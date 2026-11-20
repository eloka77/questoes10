fun main() {
    val matriz = arrayOf(
        intArrayOf(1, 2, 3, 4),
        intArrayOf(5, 6, 7, 8),
        intArrayOf(9, 10, 11, 12),
        intArrayOf(13, 14, 15, 16)
    )
    var somaDiagonalPrincipal = 0
    for (i in matriz.indices) {
        for (j in matriz[i].indices) {
            print("${matriz[i][j]}\t")
            if (i == j) {
                somaDiagonalPrincipal += matriz[i][j]
            }
        }
        println()
    }
    println("Soma da diagonal principal: $somaDiagonalPrincipal")
}