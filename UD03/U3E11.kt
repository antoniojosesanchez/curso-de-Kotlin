/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E11
 */

fun main() {

    // Solicitamos un valor numérico
    print("Introduce un número: ")
    var numero = readLine()?.toIntOrNull()

    // Comprobamos que el valor es correcto
    if (numero!=null) {
        if (numero >= 0) {

            var invert = 0
            while (numero > 0) {
                invert = (invert*10) + (numero%10)
                numero /= 10
            }

            // Mostramos la solución
            println("El número invertido es $invert")

        } else {
            println("Error: El valor debe ser positivo")
        }
    } else {
        println("Error: Entrada no válida. Introduce un número decimal.")
    }
}





