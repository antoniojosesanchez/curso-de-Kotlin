/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U5E02
 */

package main

fun main() {

    // solicitamos la lista de elementos desde el teclado
    println("Introduce la lista de elementos separados por espacios:")
    val entrada = readLine()

    // comprobamos si se ha introducido información
    if (!entrada.isNullOrEmpty()) {

        val elementos = entrada?.split(" ")?.map { it.toInt() } ?: emptyList()

        // filtramos por pares
        val pares = elementos.filter { it%2 == 0 }

        // mostramos los pares y la suma de estos
        println("Números pares: $pares")
        println("Suma: ${pares.sum()}")
    }
}