package apps.cdsoftware.mycursokotlin

fun main(){

    //con expersiones de rango utilzando el operdor ..
    val docena = 1..12
    val letras = "a".."z"

    if (5 in docena){
        println("el numero está en el rango")
    }

    if (18 !in docena ){
        println("no esta en la docena")
    }
    //for empleando rango

    for(i in 1..100){
        println(i)
    }

    //For que avance de 2 en 2 step
    for(i in 1..100 step 2)
        println(i)


    for (letra in 'a'..'z' step 2) {
        println(letra)
    }
    //iteracion en reversa downTo
    for(numero in 10 downTo   1)
        println(numero)

    //recorrer un String
    for (c in "Cesar")
        println(c)

    //for en un Array
    val campeones = arrayOf("Real Madrid","Juventus", "Liverpool")
    for (i in campeones.indices)
        println(" $i,${campeones[i]}")
}
