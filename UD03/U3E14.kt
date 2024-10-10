/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E14
 */

fun main() {

    // Solicitamos los valores
    val numeros = Array(5) {
        print("Introduce un número: ")
        readLine()!!.toInt()
    }
    
    // Guardamos la longitud 
    val longitud = numeros.size

    // Invertimos los valores
    for(i in 0 until (longitud / 2)) {

        val temp = numeros[i]
        numeros[i] = numeros[longitud - 1 - i]
        numeros[longitud - 1 - i] = temp
    }
    
    // Mostramos el array invertido
    println("El array invertido es: ${numeros.contentToString()}")
}





