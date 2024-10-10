/**
 * @author Antonio José Sánchez Bujaldón
 * Programación Básica en Kotlin
 * U3E03
 */

fun main() {

    // Solicitamos la nota desde teclado
    print("Introduce la nota del alumno: ")
    val nota = readLine()?.toDoubleOrNull()
    
    if (nota != null) {
        // Comprobar si la nota está en el rango válido
        if (nota in 0.0..10.00) {
            // Clasificar la nota
            val calificacion = when {
                nota < 5.0 -> "Suspenso"
                nota < 6.0 -> "Aprobado"
                nota < 7.0 -> "Bien"
                nota < 9.0 -> "Notable"
                else -> "Sobresaliente"
            }
            // Mostrar la calificación
            println("La calificación del alumno es: $calificacion")
        } else {
            println("Error: La nota debe estar entre 0.0 y 10.0")
        }
    } else {
        println("Error: Entrada no válida. Introduce un número decimal.")
    }
}