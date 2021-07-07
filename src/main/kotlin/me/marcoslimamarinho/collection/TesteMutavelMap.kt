package me.marcoslimamarinho.collection

fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(joao.nome, joao)
    repositorio.create(pedro.nome, pedro)
    repositorio.create(maria.nome, maria)

    println(repositorio.findByid(maria.nome))

    repositorio.findAll().forEach{ println(it) }

    repositorio.remove(maria.nome)
    repositorio.findAll().forEach{ println(it) }
}