/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U4E09
 */

import kotlin.random.Random

fun main() {

    // rellenamos un array con 20 números aleatorios
   val numeros = Array(20) { Random.nextInt(1, 100) }
   val segundo = Array(10) { Random.nextInt(1, 100) }

    // mostramos el array original
    println("Contenido original del array:")
    numeros.mostrar()

    // mostramos el segundo array
    println("\nContenido del segundo array:")
    segundo.mostrar()

    // mostramos el array filtrado
    println("\nResultado tras la unión y ordenación:")
    numeros.unir(segundo).mostrar()
}

/**
 * Función de extensión para mostrar el contenido de un array de enteros
 * @param this
 */
fun Array<Int>.mostrar():Unit { for(item in this) print("$item ") }

/**
 * Función de extensión que une dos arrays de forma ordenada
 * @param this
 * @return
 */
fun Array<Int>.unir(b:Array<Int>):Array<Int> {

    var i = 0
    val resultado = Array(this.size + b.size) { 0 }

    // añadimos los elementos del array original
    this.forEach { resultado[i++] = it }

    // añadimos los del segundo array
    b.forEach { resultado[i++] = it }

    // ordenamos y devolvemos el resultado
    resultado.sort()

    return resultado
}