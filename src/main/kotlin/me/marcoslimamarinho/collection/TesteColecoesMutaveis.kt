package me.marcoslimamarinho.collection

fun main() {
    val juvenal = Funcionario("Juvenal", 2000.0, "CLT")
    val gertrudes = Funcionario("Gertrudes", 1500.0, "CLT")
    val severina = Funcionario("Severina", 2500.0, "PJ")

    val funcionarios = mutableListOf<Funcionario>(juvenal, gertrudes)
    funcionarios.forEach { println(it) }

    println()

    funcionarios.add(severina)
    funcionarios.forEach { println(it) }

    println()

    funcionarios.remove(gertrudes)
    funcionarios.forEach { println(it) }

    println()

    val funcionarioSet = mutableSetOf<Funcionario>(juvenal)
    funcionarioSet.forEach { println(it) }

    println()

    funcionarioSet.add(gertrudes)
    funcionarioSet.add(severina)
    funcionarioSet.forEach { println(it) }

    println()

    funcionarioSet.remove(severina)
    funcionarioSet.forEach { println(it) }
}