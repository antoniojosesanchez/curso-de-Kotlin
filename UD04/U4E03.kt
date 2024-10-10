/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E03
 */

import kotlin.random.Random

fun main() {

    // solicitamos una frase al usuario
    print("Introduce una frase: ")
    val frase:String = readLine()!!

    // mostramos la cadena invertida
    println("La cadena mezclada es: ${frase.mezcla()}")
}

/**
 * Mezcla los caracteres de la cadena y devuelve
 * la secuencia resultante.
 * @param this
 * @return
 */
fun String.mezcla():String {

    // convertimos la cadena en un array
    val cadena = this.toCharArray()

    // mezclamos aleatoriamente los caracteres
    for(indice in 1 until cadena.size-1) {

        val nuevo = Random.nextInt(indice + 1)

        // intercambiamos los valores de las celdas
        val temp = cadena[indice]
        cadena[indice] = cadena[nuevo]
        cadena[nuevo] = temp
    }

    // devolvemos la cadena trasformada a cadena
    return String(cadena)
}