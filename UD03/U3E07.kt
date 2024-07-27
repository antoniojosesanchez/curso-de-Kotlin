/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * Ejercicio 07
 */

fun main() {

    // Solicitamos un valor
    print("Introduce un número: ")
    val numero = readLine()?.toIntOrNull()

    if (numero!=null) {
        // Mostramos la tabla de multiplicar
        for(i in 0..10) println("$numero * $i = ${numero * i}")
    } else {
        println("Error: Entrada no válida. Introduce un número decimal.")
    }
}





