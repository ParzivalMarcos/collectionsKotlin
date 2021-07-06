package me.marcoslimamarinho.collection

const val SEPARADOR = "-----------------------"
fun main() {
    //arrayInt()
    //arrayIntOf()
    //arrayString()
    arrayDoubleArray()
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

fun arrayString(){
    val nomes = Array(3){""}
    nomes[0] = "Maria"
    nomes[1] = "Marcos"
    nomes[2] = "Ideltudes"

    for (nome in nomes) {
        println(nome)
    }

    println(SEPARADOR)
    nomes.sort()
    nomes.forEach { println(it) }

    println(SEPARADOR)

    val nomes2 = arrayOf("Peter", "Zack", "Mary")  // Declarando o tipo e quantidade ja infere
    nomes2.sort()
    nomes2.forEach { println(it) }
}

fun arrayDoubleArray(){
    val salarios = DoubleArray(3)  // Define a quantidade
    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 2540.0

    salarios.forEach { println(it) }

    println(SEPARADOR)

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }
    salarios.forEach { println(it) }

    println(SEPARADOR)

    val salarios2 = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salarios2.sort()
    salarios2.forEach { println(it) }

}
