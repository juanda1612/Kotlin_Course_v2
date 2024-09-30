fun main() {
    menu()
}

fun coche(
    antigüedadC : Int = 5,
    kilometrosR : Int = 100000,
    velocidadMaxima : Int = 120,
    transmisionAutomatica : Boolean = false) {

    // precio por defecto del vehiculo
    var precioCoche = 20000

    // precio dependiendo de cada año
    precioCoche -= 2000 * antigüedadC

    // precio dependiendo de la velocidad
    if (velocidadMaxima < 120){
        precioCoche -= (120 - velocidadMaxima) * 100
    } else {
        precioCoche += (velocidadMaxima - 120) * 100
    }

    // precio dependiendo de los kilometros
    precioCoche -= (kilometrosR/10000)*200

    // precio dependiendo de si es automatico o no
    if (transmisionAutomatica){
        precioCoche += 1500
    }

    println("El precio del coche es: $precioCoche")
}

fun menu(){
    println("¿Quieres modificar algun parametro?")
    var opcion = readln()
    while (opcion.equals("si", ignoreCase = true)) {
        println("¿Que quieres modificar?")
        var opcion2 : String = readln()
        when (opcion2){
            "antigüedad" -> coche(antigüedadC = readln().toInt())
            "kilometros" -> coche(kilometrosR = readln().toInt())
            "velocidad Maxima" -> coche(velocidadMaxima = readln().toInt())
            "transmision Automatica" -> coche(transmisionAutomatica = readln().toBoolean())
        }
        println("¿Quieres modificar algo mas?")
        opcion = readln()
    }
}
