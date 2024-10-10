/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U6E01
 */

package clases

abstract class Vehiculo(val marca: String, val modelo: String, val anio: Int) {

    abstract fun arrancar()

    /**
     * Mostramos información sobre el vehículo
     * @return
     */
    fun detener() = println("El coche $marca $modelo del año $anio se ha detenido.")
}