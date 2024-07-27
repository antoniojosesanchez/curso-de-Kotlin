/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * E2E08
 */

fun main() {

    // Solicitamos una letra
    print("Introduce una letra: ")
    val inicio = readLine()!!.first()

    // Solicitamos una segunda letra
    print("Introduce otra letra: ")
    val final = readLine()!!.first()

    // Definimos el rango y lo mostramos en pantalla. Utilizamos
    // utilizar el método toList. Más adelante estudiaremos las
    // listas.
    val rango = inicio .. final
    println("El rango generado es ${rango.toList()}")
}