/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E04
 */

fun main() {

    // Leer la nota desde la entrada del usuario
    print("Introduce la temperatura en grados Celsisus: ")
    val celsius = readLine()?.toDoubleOrNull()

    if (celsius != null) {
        
        // Realizamos el cálculo y lo mostramos por pantalla
        val farenheit = (celsius * 9) / 5 + 32 
        println("${celsius}º Celsius son ${farenheit}")
    } else {
        println("Error: Entrada no válida. Introduce un número decimal.")
    }
}