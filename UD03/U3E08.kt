/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E08
 */

fun main() {

    // Inicializamos las variables
    var suma = 0
    
    for (i in 1..10) {

        // Solicitamos el valor
        print("Introduce un número: ")
        val numero = readLine()!!.toInt()

        // Sumamos si es par
        if (numero%2 == 0) suma += numero
    }

    // Mostramos el resultado de la suma
    println("La suma de todos los pares es $suma")
}





