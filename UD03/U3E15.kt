/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E15
 */

fun main() {

    // Solicitamos la cadena
    print("Introduce una cadena: ")
    val cadena =  readLine()

    // Iniciamos las variables
    var vocales = 0

    for(i in 0 until cadena!!.length) {
        vocales += when (cadena[i].lowercase()) {
            "a", "e", "i", "o", "u" -> 1
            else -> 0
        }
    }

    // Mostramos el array invertido
    println("Hay un total de $vocales vocales")
}





