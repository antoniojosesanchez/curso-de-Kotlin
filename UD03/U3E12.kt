/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E12
 */

fun main() {

    // Solicitamos un valor numérico
    print("Introduce un número: ")
    var altura = readLine()?.toIntOrNull()

    // Comprobamos que el valor es correcto
    if (altura!=null) {
        if (altura >= 0) {

            for(fil in 1..altura) {

                // Dibujamos los espacios previos
                for(col in 1..(altura - fil)) print(' ')

                // Escribimos los valores numéricos en orden creciente
                for(col in 1..fil) print(col)

                // Escribimos los valores numéricos en orden decreciente
                for(col in (fil-1) downTo 1) print(col)

                // Saltamos a la siguiente línea
                println()
            }
        } else {
            println("Error: El valor debe ser positivo")
        }
    } else {
        println("Error: Entrada no válida. Introduce un número decimal.")
    }
}





