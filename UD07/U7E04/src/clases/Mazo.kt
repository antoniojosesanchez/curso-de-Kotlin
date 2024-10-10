/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E04
 */

package clases

class Mazo {

    private val palos = listOf("Corazones", "Diamantes", "Tréboles", "Picas")
    private val valores = listOf(1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0)
    private val figuras = listOf(0.5, 0.5, 0.5)  // Sota, Caballo, Rey

    private val cartas: MutableList<Carta> = mutableListOf()

    init { generarMazo() }

    /**
     * Genera las cartas del mazo
     * @return
     */
    private fun generarMazo() {
        for (palo in palos) {

            // añade las cartas al mazo
            for (valor in valores) cartas.add(Carta(palo, valor))

            // añade las figuras al mazo
            for (figura in figuras) {
                cartas.add(Carta(palo, figura))
            }
        }
    }

    /**
     * Baraja el mazo de cartas
     * @return
     */
    fun barajar() {
        cartas.shuffle()
    }

    /**
     * Reparte una carta, concretamente la que se encuentra
     * al principio del mazo.
     * @return
     */
    fun repartirCarta(): Carta {

        // si no hay cartas en el mazo se genera éste y
        // seguidamente se baraja
        if (cartas.isEmpty()) {
            generarMazo()
            barajar()
        }

        // devolvemos la carta
        return cartas.removeAt(0)
    }

}