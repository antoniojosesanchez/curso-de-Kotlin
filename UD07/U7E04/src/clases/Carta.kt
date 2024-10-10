/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E04
 */

package clases

data class Carta(val palo: String, val valor: Double) {
    /**
     * Sobrecargamos el método toString
     * @return
     */
    override fun toString(): String = if (valor == 0.5) "$palo - Figura (0.5)" else "$palo - $valor"
}