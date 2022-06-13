package one.digitalinnovation.digionebank

class Pessoa {
   var nome:String="Jether"
   var cpf:String="123.123.123.111"
   private set    // Deixou como private somente a função que atribui valor aquela properiedade

   //constructor()   //costrutor secundario
   fun personaInfo() = "A pessoa se chama $nome e tem o numero de CPF: $cpf"

}

fun main() {
    val jether=Pessoa()

    println(jether.personaInfo())



}