/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * E2E04
 */

fun main() {

    // Solicitamos la cadena
    print("Introduce una cadena: ")
    val cadena:String? = readLine()

    // Mostramos la longitud
    println("La longitud es ${cadena?.length}")

    // Mostramos la cadena en mayúsculas o un mensaje indicando
    // que está vacía.
    println(cadena?.uppercase() ?: "La cadena está vacía.")
}