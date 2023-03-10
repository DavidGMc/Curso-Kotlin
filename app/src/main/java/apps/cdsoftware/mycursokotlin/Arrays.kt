package apps.cdsoftware.mycursokotlin

fun main(){
     /* La clase Array te provee operadores set() y get()
      para asignar y obtener valores en los índices de tus arreglos
      */

    //almacenar 7 dias de la semana
    val diasSemanas = arrayOf("Lunes", "Martes", "Miercoles","Jueves", "Sabádo","Domingo")
    println(diasSemanas.get(0))  //lunes
    println(diasSemanas.get(1))  //Martes


     //es preferible usar el operador de acceso indexado [ ] para referirte a los elementos
    val planets = arrayOfNulls<String>(3)
    planets[0]= "Mercurio"
    planets[1]= "Venus"
    planets[2]= "Tierra"

    println(planets.contentToString()) //La función joinToString() permite crear un String legible para imprimir.
                                       // Aunque también puedes usar contentToString()

    for(i in planets.indices){
        println("${planets[i]} está en la posición ${i+1}")
    }

    for (i in 0 until planets.size) {   //usar la funcion size del mismo Array
        println("${planets[i]} está en la posición ${i + 1}")
    }


}