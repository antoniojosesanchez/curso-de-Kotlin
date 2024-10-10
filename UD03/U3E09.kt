/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E09
 */

fun main() {

    // Inicializamos las variables
    var fact = 1

    // Solicitamos un valor numérico
    print("Introduce un número: ")
    val numero = readLine()?.toIntOrNull()

    // Comprobamos que el valor es correcto
    if (numero!=null) {
        if (numero >= 0) {

            // Realizamos copia del número
            var temp = numero

            while(temp > 0) {
                fact *= temp
                temp--
            }

            // Mostramos el resultado
            println("El factorial de $numero es $fact")

        } else {
            println("Error: El valor debe ser positivo")
        }
    } else {
        println("Error: Entrada no válida. Introduce un número decimal.")
    }    println("Error: La nota debe estar entre 0.0 y 10.0")
        }
    } else {
        println("Error: Entrada no válida. Introduce un número decimal.")
    }
}