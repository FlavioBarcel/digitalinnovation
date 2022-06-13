package one.digitalinnovation.digionebank

class Pessoa {
   var nome:String="Jether"
   var cpf:String="123.123.123.111"
   //private set    // Deixou como private somente a função que atribui valor aquela properiedade

}

fun main() {
    val jether=Pessoa()
    jether.cpf="345"

    println(jether)
    println(jether.nome)
    println(jether.cpf)


}