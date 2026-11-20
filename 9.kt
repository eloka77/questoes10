fun main() {
    val matriz = arrayOf(
        intArrayOf(4, 0, 7),
        intArrayOf(0, 5, 0),
        intArrayOf(2, 0, 9)
    )
    var somaPositivos = 0
    for (linha in matriz) {
        for (valor in linha) {
            if (valor == 0) {
                continue
            }
            somaPositivos += valor
        }
    }
    println("Soma dos valores maiores que zero: $somaPositivos")
}