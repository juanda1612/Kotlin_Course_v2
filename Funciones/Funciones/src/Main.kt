fun main() {
    // aqui hacemos la llamada
    felicitar()

    // aqui llamamos la segunda funcion
    val resultado = felicitar2()
    println(resultado)

    // aqui llamamos la tercera funcion
    val resultado2 = felicitar3("Asterix",50)
    val resultado3 = felicitar3(edad = 60 , nombre = "Pablo")
}

// ejemplo para declarar una funcion
fun felicitar() {
    val nombre : String = "Chucky"
    val edad = 5
    println("Felicidades!, $nombre, cumples $edad")
}

fun felicitar2() : String {
    val nombre : String = "Pedro"
    val edad = 7
    return "Felicidades!, $nombre, cumples $edad"
}

fun felicitar3(nombre : String, edad : Int) : String {
    return "Felicidades!, $nombre, cumples $edad"
}
