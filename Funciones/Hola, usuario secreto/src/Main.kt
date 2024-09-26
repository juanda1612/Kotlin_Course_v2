fun main() {
    println("Nombre")
    val nombre = readln()

    println("¿Quieres ocultar tu nombre?")
    val respuesta = readln()

    if (respuesta.equals("si", ignoreCase = true)) {
        println(saludos())
    }else {
        println(saludos(nombre))
    }
}

fun saludos(nombre : String = "usuario secreto") : String {
    return if (nombre == "usuario secreto"){
        "Hola, usuario secreto"
    }else {
        "Hola, $nombre"
    }
}

