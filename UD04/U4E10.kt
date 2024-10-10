/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E10
 */

import kotlin.random.Random

fun main() {

    // rellenamos un array con 20 números aleatorios
   val numeros = Array(20) { Random.nextInt(1, 100) }

    // mostramos el array original
    println("Contenido original del array:")
    numeros.mostrar()

    // preguntamos cuánto se debe rotar
    print("\n¿Cuántas posiciones rotamos?: ")
    val pasos = readLine()!!.toInt()

    // mostramos el array filtrado
    println("\nArray rotado $pasos pasos a la izquierda:")
    numeros.desplazar(pasos)
    numeros.mostrar()
}

/**
 * Función de extensión para mostrar el contenido de un array de enteros
 * @param this
 */
fun Array<Int>.mostrar():Unit { for(item in this) print("$item ") }

/**
 * Función de extensión que realiza rota los elementos del array tantas
 * posiciones a la izquierda como se indique
 * @param this
 * @param pasos
 */
fun Array<Int>.desplazar(pasos: Int) {

    // realizamos los desplazamientos indicados
    for(i in 1..pasos) {
        val temp = this[0]
        for(j in 0 until this.size-1) this[j] = this[j+1]
        this[this.size-1] = temp
    }
}