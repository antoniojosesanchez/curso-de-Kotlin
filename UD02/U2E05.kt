/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * E2E05
 */

fun main() {

    // Solicitamos la base
    print("Introduce el valor de la base: ")
    val base = readLine()!!.toDouble()

    // Solicitamos el exponente
    print("Introduce el exponente: ")
    val exponente = readLine()!!.toDouble()

    // Calculamos y mostramos la potencia
    val potencia = Math.pow(base, exponente)
    println("El resultado de $base elevado a $exponente es: $potencia")
}