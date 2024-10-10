/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E04
 */

fun main() {

    // solicitamos una frase al usuario
    print("Introduce una frase: ")
    val frase:String = readLine()!!

    // mostramos el número de vocales de la frase leída
    println("La frase tiene con ${frase.contarVocales()} vocales")
}


/**
 * Cuenta y devuelve el total de vocales de la cadena
 * @param this
 * @return
 */
fun String.contarVocales():Int {

    var total = 0
    this.forEach {
        total += when(it.lowercase()) {
            "a", "e", "i", "o", "u" -> 1
            else -> 0
        }
    }

    return total
}