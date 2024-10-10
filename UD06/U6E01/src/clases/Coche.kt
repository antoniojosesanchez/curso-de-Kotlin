/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U6E01
 */

package clases

class Coche(marca: String, modelo: String, anio: Int, var autonomia: Int): Vehiculo(marca, modelo, anio), Electrico {

    /**
     * Simulamos el arranque del coche
     * @return
     */
    override fun arrancar() = println("El coche $marca $modelo del año $anio ha arrancado.")

    /**
     * Simulamos la carga de la batería
     * @throws
     */
    override fun cargarBateria()  {
        if (autonomia == 0) {
            throw Exception("La batería ya está completamente cargada.")
        } else {
            autonomia = 100
            println("Batería cargada. La autonomía ahora es de $autonomia kilómetros.")
        }
    }
}