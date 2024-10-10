/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U5E01
 */

package main

fun main() {

    // solicitamos el texto por teclado
    println("Introduce el texto:")
    val texto = readLine() ?: ""

    // convertimos el texto a minúsculas y lo didivimos en palabras
    val palabras = texto.lowercase().split("\\s+".toRegex())

    // contamos la frecuencia de cada palabra y guardamos en un mapa
    val conteo = palabras.groupBy { it }.mapValues { it.value.size }

    // ordenamos por frecuencia descendente
    val ordenadas = conteo.entries.sortedByDescending { it.value }

    // mostramos las palabras y sus frecuencias
    println("Frecuencia de palabras:")
    ordenadas.forEach { (palabra, frecuencia) -> println("$palabra: $frecuencia") }
}