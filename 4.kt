fun main() {
    val numeros = IntArray(20) { it + 1 }
    var somaIndicesPares = 0
    for (i in 0 until numeros.size step 2) {
        somaIndicesPares += numeros[i]
    }
    println("Soma dos índices pares: $somaIndicesPares")
}