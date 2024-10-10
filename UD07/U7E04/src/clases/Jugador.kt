/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E04
 */

package clases

class Jugador {

    private val mano: MutableList<Carta> = mutableListOf()

    /**
     * El jugador coje carta del mazo
     * @param carta
     */
    fun recibirCarta(carta: Carta) {
        mano.add(carta)
    }

    /**
     * Se calcula la puntuación del jugador
     * @return
     */
    fun calcularPuntuacion(): Double {
        return mano.sumOf { it.valor }
    }

    /**
     * Devuelve información sobre la mano del jugador
     * @return
     */
    fun mostrarMano(): String = mano.joinToString(separator = ", ") { it.toString() }

    /**
     * Comprueba si el jugador tiene 7 y media
     * @return
     */
    fun tieneSieteYMedia(): Boolean = calcularPuntuacion() == 7.5
}