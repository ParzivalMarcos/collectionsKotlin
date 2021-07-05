package me.marcoslimamarinho.collection

const val SEPARADOR = "-----------------------"
fun main() {
    //arrayInt()
    arrayIntOf()
}

fun arrayInt(){
    val values = IntArray(5) // Necessário definir o tamanho do array

    values[0] = 40
    values[1] = 22
    values[2] = 33
    values[3] = 10
    values[4] = 51

    // Laço comum
    for (valor in values){
        println(valor)
    }

    println(SEPARADOR)

    // Expressões Lambdas
    values.forEach { valor ->
        println(valor)
    }

    println(SEPARADOR)

    // Iterando sobre os índices do Array
    for (index in values.indices){
        println(values[index])
    }

    println(SEPARADOR)

    values.sort()
    values.forEach { println(it) }

    println(SEPARADOR)
}

fun arrayIntOf(){
    val values = intArrayOf(2, 3, 1, 19, 14, 0)  // Inicializa passando os valores do array

    values.forEach { println(it) }

    println(SEPARADOR)

    values.sort()
    values.forEach { println(it) }




}


