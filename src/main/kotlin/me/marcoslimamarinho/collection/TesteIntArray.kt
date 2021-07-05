package me.marcoslimamarinho.collection

fun main() {
    arrayInt()
}

fun arrayInt(){
    val values = IntArray(5) // Necessário definir o tamanho do array

    values[0] = 40
    values[1] = 22
    values[2] = 33
    values[3] = 10
    values[4] = 51

    fun separador(){
        println("-----------------------")
    }

    // Laço comum
    for (valor in values){
        println(valor)
    }

    separador()

    // Expressões Lambdas
    values.forEach { valor ->
        println(valor)
    }

    separador()

    // Iterando sobre os índices do Array
    for (index in values.indices){
        println(values[index])
    }

    separador()

    values.sort()
    values.forEach { println(it) }
}
