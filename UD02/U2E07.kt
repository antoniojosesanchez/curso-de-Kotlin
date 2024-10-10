/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * E2E07
 */

fun main() {

    // Solicitamos valores numéricos
    println("Introduce 5 valores numéricos enteros: ")
    val numeros = Array(5) { readLine()!!.toInt() }
    
    // Mostramos la suma de todos ellos
    println("La suma de los elementos es: ${ numeros.sum() }")
}