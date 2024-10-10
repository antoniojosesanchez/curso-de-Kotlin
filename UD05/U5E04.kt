/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U5E04
 */

fun main() {

    var jugar = true

    // solicitamos el nombre de cada jugador
    println("Ingrese el nombre del jugador 1:")
    val jugador1 = readLine() ?: "Jugador 1"
    println("Ingrese el nombre del jugador 2:")
    val jugador2 = readLine() ?: "Jugador 2"

    // iniciamos el juego
    while (jugar) {

        println("¿Cuántas rondas desea jugar?")
        val rondas = readLine()?.toIntOrNull() ?: 1

        // Inicializar variables
        val historial = mutableListOf<Map<String, Any>>()
        var victoriasJugador1 = 0
        var victoriasJugador2 = 0

        // jugamos las rondas
        for (numeroRonda in 1..rondas) {

            println("\nRonda $numeroRonda:")

            // jugamos la ronda en curso
            val (puntosJugador1, puntosJugador2) = jugarRonda()

            val resultado = when {
                puntosJugador1 > puntosJugador2 -> {
                    victoriasJugador1++
                    "Ganó $jugador1"
                }
                puntosJugador1 < puntosJugador2 -> {
                    victoriasJugador2++
                    "Ganó $jugador2"
                }
                else -> "Empate"
            }

            // guardamos los resultados
            historial.add(mapOf(
                "Ronda" to numeroRonda,
                "Jugador1" to puntosJugador1,
                "Jugador2" to puntosJugador2,
                "Resultado" to resultado
            ))

            // Mostrar resumen del historial
            mostrarHistorial(historial)
        }

        // Mostrar el resultado final
        mostrarResultadoFinal(jugador1, jugador2, victoriasJugador1, victoriasJugador2)

        // Preguntar si se desea jugar otra vez
        println("¿Desea jugar otra vez? (sí/no)")
        jugar = readLine()?.trim()?.lowercase() == "sí"
    }

    println("¡Gracias por jugar!")
}

/**
 * Lanza dos dados y devuelve la suma
 * @return
 */
fun lanzarDados(): Int = Random.nextInt(1, 7) + Random.nextInt(1, 7)

/**
 * Jugamos una ronda
 * @return
 */
fun jugarRonda(): Pair<Int, Int> = lanzarDados() to lanzarDados()

/**
 * Se muestra el historial de resultados
 * @param historial
 */
fun mostrarHistorial(historial: List<Map<String, Any>>) {

    println("\nHistorial de Resultados:")
    for (registro in historial) {
        println("Ronda ${registro["Ronda"]}: ${registro["Jugador1"]} - ${registro["Jugador2"]}: ${registro["Resultado"]}")
    }
}

/**
 * La función muestra el resultado final
 * @param jugador1
 * @param jugador2
 * @param victoriasJugador1
 * @param victoriasJugador2
 */
fun mostrarResultadoFinal(jugador1: String, jugador2: String, victoriasJugador1: Int, victoriasJugador2: Int) {

    println("\nResultado Final:")
    println("$jugador1 ganó $victoriasJugador1 ronda(s).")
    println("$jugador2 ganó $victoriasJugador2 ronda(s).")

    when {
        victoriasJugador1 > victoriasJugador2 -> println("¡$jugador1 es el ganador del juego!")
        victoriasJugador1 < victoriasJugador2 -> println("¡$jugador2 es el ganador del juego!")
        else -> println("¡El juego termina en empate!")
    }
}