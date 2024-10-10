/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E13
 */

fun main() {

    // Solicitamos el valor
    print("Introduce un número: ")
    val numero = readLine()!!.toInt()

    // Inicializamos las variables
    var minimo = numero
    var maximo = numero

    for (i in 1 until 10) {

        // Solicitamos el valor
        print("Introduce un número: ")
        val numero = readLine()!!.toInt()

        // Comprobamos el máximo y el mínimo
        if (numero > maximo) maximo = numero
        if (numero < minimo) minimo = numero
        
    }
    
    println("El máximo es $maximo")
    println("El mínimo es $minimo")
}





