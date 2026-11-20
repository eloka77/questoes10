fun main() {
    val temperaturas = doubleArrayOf(28.5, 31.0, 27.0, 33.2, 30.0, 29.5, 32.0)
    var soma = 0.0
    for (temp in temperaturas) {
        soma += temp
    }
    val media = soma / temperaturas.size
    println("Média: $media")
    for (i in temperaturas.indices) {
        if (temperaturas[i] > media) {
            println("Índice acima da média: $i (${temperaturas[i]})")
        }
    }
}