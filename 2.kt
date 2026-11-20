fun main() {
    val codigos = arrayOf("TX01", "TX02", "TX03", "TX04", "TX05")
    val alvo = "TX03"
    for (i in codigos.indices) {
        if (codigos[i] == alvo) {
            println("Encontrado na posição: $i")
            break
        }
    }
}