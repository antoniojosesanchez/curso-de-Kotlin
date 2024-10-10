/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E01
 */
import kotlin.random.Random

fun main() {

    var pregunta: String

    do {
        // Inicia una nueva partida
        jugar()

        // pregunta al jugador si quiere jugar otra vez
        println("¿Quieres jugar otra vez? (s/n): ")
        pregunta = readln().lowercase()

    } while (pregunta == "s")

    // finaliza el juego con un mensaje de despedida
    println("Gracias por jugar. ¡Hasta la próxima!")
}

/**
 * Función del juego de Adivinar Números
 * @return
 */
fun jugar() {

    val numeroAleatorio = generarNumeroAleatorio(1, 100)
    val maxIntentos = 10

    // muestra el mensaje de bienvenida y las instrucciones de juego
    println("¡Bienvenido al juego de adivinanza numérica!")
    println("He generado un número entre 1 y 100. Tienes $maxIntentos intentos para adivinarlo.")

    var intento = 1

    while (intento <= maxIntentos) {

        // pide al usuario que adivine el número
        print("Intento $intento: ¿Cuál crees que es el número? ")
        val numero = readln().toInt()

        when {
            numero < numeroAleatorio -> println("El número es mayor que $numero.")
            numero > numeroAleatorio -> println("El número es menor que $numero.")
            else -> {
                println("¡Felicidades! Adivinaste el número en $intento intentos.")
                return
            }
        }

        intento++
    }

    // el jugador gasta todos los intentos y pierde la partida
    println("Lo siento, te has quedado sin intentos. El número era $numeroAleatorio.")
}

/**
 * La función genera un número aleatorio dentro de un rango específico
 * @param min
 * @param max
 * @return
 */
fun generarNumeroAleatorio(min: Int, max: Int): Int = Random.nextInt(min, max + 1)