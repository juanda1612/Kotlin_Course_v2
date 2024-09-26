import kotlin.math.pow

// copia este fichero y cámbiale el nombre a Task_TuNombre.kt
// añade parámetros, tipo de retorno y completa el bloque
fun interesCompuesto() {
    var amount = 1000
    var percent = 5.0
    var years = 10

    println("¿Que deseas modificar?")
    val eleccion = readln()

    val nombreParametro = when(eleccion) {
        "amount" -> amount = readln().toInt()
        "percent" -> percent = readln().toDouble()
        "years" -> years = readln().toInt()
        else -> {
            println("Error")
        }
    }

    val cantidadFinal = amount * (1+ percent/100).pow(years)
    println("%.2f".format(cantidadFinal))

}
// en el mét0do main() se lee por teclado el parámetro para el que se va a proporcionar un valor distnto al del valor por defecto, y el valor correspondiente
fun main() {
    interesCompuesto()
}