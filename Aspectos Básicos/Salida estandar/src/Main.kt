fun main() {
    val (nombre1, nombre2, nombre3) = readln().split(" ")
    println("$nombre1 $nombre2 $nombre3")

    // cuando quiero mostrar por pantalla no variables sino "algo mas" relacionado con las variables, se pone la expresion ${} entre {}
    println("${nombre1.length} ${nombre2[0]} ${nombre3[nombre3.length - 1]}")
}
