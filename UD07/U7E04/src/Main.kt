

/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E04
 */

import clases.Jugador
import clases.Mazo

fun main() {

    val mazo = Mazo()
    val jugador = Jugador()
    var continuar = true

    // barajamos el mazo de cartas antes de comenzar
    mazo.barajar()

    // comienza el juego
    while (continuar) {

        // se obtiene una carta del mazo
        val carta = mazo.repartirCarta()

        // se asigna al jugador
        jugador.recibirCarta(carta)

        // se calcula la puntuación del jugador
        val puntuacion = jugador.calcularPuntuacion()

        // se muestra información de la jugada
        println("Has recibido: $carta")
        println("Tu mano: ${jugador.mostrarMano()}")
        println("Puntaje actual: $puntuacion")

        // comprobamos situación del juego
        if (puntuacion > 7.5) {
            println("¡Te pasaste de 7.5! Has perdido.")
            continuar = false
        } else if (jugador.tieneSieteYMedia()) {
            println("¡Exactamente 7.5! Has ganado.")
            continuar = false
        } else {
            println("¿Quieres otra carta? (S/N)")
            val respuesta = readlnOrNull()?.lowercase()
            if (respuesta != "s") {
                println("Te has plantado con un puntaje de $puntuacion. ¡Fin del juego!")
                continuar = false
            }
        }
    }
}