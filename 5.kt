fun main() {
    val tarefas = arrayOf("Criar tela de login", "Configurar base de dados", "Testar API")
    for ((indice, tarefa) in tarefas.withIndex()) {
        println("${indice + 1} - $tarefa")
    }
}