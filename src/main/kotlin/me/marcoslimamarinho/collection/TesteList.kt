package me.marcoslimamarinho.collection

fun main() {
    val juvenal = Funcionario("Juvenal", 2000.0, "CLT")
    val gertrudes = Funcionario("Gertrudes", 1500.0, "CLT")
    val severina = Funcionario("Severina", 2500.0, "PJ")

    val funcionarios = listOf<Funcionario>(juvenal, gertrudes, severina)

    funcionarios.forEach { println(it) }

    println(funcionarios.find { it.nome == "Severina" })

    // Ordenando por salario
    funcionarios
        .sortedBy { it.salario }
        .forEach { println(it) }


    // Agrupando por tipo de contratação
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }

}