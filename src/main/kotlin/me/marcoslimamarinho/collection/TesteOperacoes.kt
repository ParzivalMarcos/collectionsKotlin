package me.marcoslimamarinho.collection

//const val SEPARADOR1 = "------------------------"
fun main() {
    val salarios = doubleArrayOf(1000.0, 2650.0, 4000.0)

    salarios.forEach { println(it) }
    println(SEPARADOR)
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Media salarial: ${salarios.average()}")

    val salariosFilterMaiorQue2500 = salarios.filter { it > 2500.0 }
    println(SEPARADOR)
    salariosFilterMaiorQue2500.forEach { println(it) }

    println(SEPARADOR)
    println(salarios.count { it in 2000.0 .. 5000.0 })

    println(SEPARADOR)
    println(salarios.find { it == 2650.0 })

    println(SEPARADOR)
    println(salarios.any { it == 1000.0 })
}
