/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U7E02
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
 * Función del juego del Ahorcado
 * @return
 */
fun jugar() {

    val palabras = listOf(
        "kotlin",
        "desarrollo",
        "tecnologia",
        "internet",
        "computadora",
        "inteligencia",
        "artificial",
        "algoritmo",
        "programacion",
        "software",
        "hardware",
        "criptografia",
        "seguridad",
        "interfaz",
        "navegador",
        "base",
        "datos",
        "servidor",
        "aplicacion",
        "codigo"
    )

    val palabraSecreta = elegirPalabraSecreta(palabras)
    val letrasAdivinadas = mutableSetOf<Char>()

    val intentosMaximos = 6
    var intentosRestantes = intentosMaximos

    // muestra el mensaje de bienvenida y las instrucciones de juego
    println("¡Bienvenido al juego del Ahorcado!")
    println("Debes adivinar una palabra secreta. Tienes $intentosRestantes intentos para adivinarla.")

    while (intentosRestantes > 0) {

        // mostramos el estado actual del juego
        mostrarEstadoActual(palabraSecreta, letrasAdivinadas, intentosRestantes)

        // solicitamos una letra
        print("Ingresa una letra: ")
        val letra = readln().lowercase()[0]

        // si la letra ya se ha elegido antes solicitamos otra
        if (letrasAdivinadas.contains(letra)) {
            println("Ya has elegido esa letra. Intenta con otra.")
            continue
        }

        // añadioms la letra al conjunto de letras elegidas por el usuario
        letrasAdivinadas.add(letra)

        // se muestra un mensaje y se contabilizan los intentos si la letra
        // elegida no está en la palabra
        if (palabraSecreta.contains(letra)) {
            println("¡Bien hecho! La letra '$letra' está en la palabra.")
        } else {
            println("Lo siento, la letra '$letra' no está en la palabra.")
            intentosRestantes--
        }

        // el jugador acierta la palabra y el juego termina
        if (palabraSecreta.all { it in letrasAdivinadas }) {
            println("¡Felicidades! Has adivinado la palabra: $palabraSecreta")
            return
        }
    }

    // el jugador gasta todos los intentos y pierde la partida
    println("Lo siento, te has quedado sin intentos. La palabra era: $palabraSecreta")
}

// Función que selecciona una palabra secreta aleatoriamente de una lista
/**
 * La función elige una palabra al azar entre todas las existentes en a lista
 * que se pasa como parámetro.
 * @param palabras
 * @return
 */
fun elegirPalabraSecreta(palabras: List<String>): String = palabras[Random.nextInt(palabras.size)]

/**
 * La función se encarga de mostrar un resumen del estado del juego.
 * @param palabraSecreta
 * @param letrasAdivinadas
 * @param intentosRestantes
 * @return
 */
fun mostrarEstadoActual(palabraSecreta: String, letrasAdivinadas: Set<Char>, intentosRestantes: Int) {

    val estadoPalabra = palabraSecreta.map { if (it in letrasAdivinadas) it else '_' }.joinToString(" ")

    println("\nPalabra: $estadoPalabra")
    println("Intentos restantes: $intentosRestantes")
    println("Letras adivinadas: ${letrasAdivinadas.joinToString(", ")}")
}