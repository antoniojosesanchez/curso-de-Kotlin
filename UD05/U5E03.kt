/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U5E03
 */

package main

fun main() {

    // solicitamos la lista de elementos desde teclado
    println("Introduce la lista de elementos separados por comas:")
    val elementos = readLine()?.split(",")?.map { it.toInt() } ?: emptyList()

    // solicitamos el número mínimo de ocurrencias desde el teclado
    println("Introduce el número mínimo de ocurrencias:")
    val minimas = readLine()?.toIntOrNull() ?: 0

    // agrupamos y filtramos por el número mínimo de ocurrencias
    val ocurrencias = elementos.groupBy { it }.mapValues { it.value.size }.filter { it.value >= minimas }

    // Muestra los pares
    println("Pares encontrados (con al menos $minimas ocurrencias):")
    ocurrencias.forEach { (elemento, count) ->

        // calculamos cuántos grupos de ocurrencias mínimas se pueden formar
        val cantidadGrupos = count / minimas

        // imprimimos los grupos completos
        repeat(cantidadGrupos) {
            println("(${List(minimas) { elemento }.joinToString(", ")})")
        }
    }
}

