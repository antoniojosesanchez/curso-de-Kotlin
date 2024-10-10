/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U6E01
 */

import clases.Coche
import clases.Conductor

fun main() {

    // creamos una instancia de clase Coche
    val coche = Coche("Citröen", "C5", 2022, 100)

    // creamos una instancia del Conductor
    val conductor = Conductor("Javier Jiménez", "B1")

    //
    println("${conductor.nombre} está conduciendo un ${coche.marca} ${coche.modelo}.")

    // simulamos el proceso de arrancar, cargar y detener
    try {
        coche.arrancar()
        coche.cargarBateria()
        coche.detener()
    } catch(excepcion: Exception) {
        println("Error: ${excepcion.message}")
    }


}