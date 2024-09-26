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
    var antigüedadC : Int = 0
    var kilometrosR : Int = 0
    var velocidadMaxima : Int = 0
    var transmisionAutomatica : Boolean = false

    var opcion2 : String = ""
    println("¿Quieres modificar algun parametro?")
    var opcion3 = readln()
    while (opcion3.equals("si", ignoreCase = true)) {
        println("¿Que quieres modificar?")
        var opcion : String = readln()
        when (opcion){
            "antigüedad" -> antigüedadC = readln().toInt()
            "kilometros" -> kilometrosR = readln().toInt()
            "velocidad Maxima" -> velocidadMaxima = readln().toInt()
            "transmision Automatica" -> opcion2 = readln()
        }

        if (opcion2.equals("si",ignoreCase = true)){
            transmisionAutomatica = true
        }else{
            transmisionAutomatica = false
        }
        println("¿Quieres modificar algo mas?")
        opcion3 = readln()
    }
    if(opcion2.equals("si",ignoreCase = true)) {
        coche(antigüedadC, kilometrosR, velocidadMaxima, transmisionAutomatica)
    }else{
        coche()
    }
}
